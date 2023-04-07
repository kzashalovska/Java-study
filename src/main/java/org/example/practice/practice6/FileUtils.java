package org.example.practice.practice6;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileUtils extends Thread {
    File file;
    String path;
    String fileName;
    Thread thread;
    StringBuilder stringBuilder = new StringBuilder();
    Pattern pattern;


    FileUtils(String path, String fileName, String sPattern) {
        pattern = Pattern.compile(sPattern);
        file = new File(path);
        this.fileName = fileName;
        thread = new Thread(this);
    }

    @Override
    public void run() {
        findFiles(file, fileName, thread, pattern);
    }

    public void findFiles(File file, String fileName, Thread thread, Pattern pattern) {
        Matcher matcher;
        if (!file.exists()) {
            System.out.println("Папки не існує!");
            return;
        }
        // перевірка, чи це дійсно папка
        if (!file.isDirectory()) {
            System.out.println("Шлях не вказує на папку!");
            return;
        }
        File[] files = file.listFiles();
        assert files != null;
        for (File inFile : files) {
            matcher = pattern.matcher(inFile.getName());
            if (inFile.isFile() & matcher.find()) {
                stringBuilder.append(inFile.getParent()).append("\n");
                System.out.println(thread.getName());
//                try {
//                    thread.join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
            if (inFile.isDirectory()) {
                findFiles(inFile, fileName, new Thread(), this.pattern);
            }
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter
                (new OutputStreamWriter(Files.newOutputStream(Paths.get(fileName))))) {
            bufferedWriter.write(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

