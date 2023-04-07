package org.example.practice.practice6;

import java.io.*;

public class FileUtilsCopy extends Thread {
    File inFile;
    String outPath;
    Thread thread;


    FileUtilsCopy(String inPath, String outPath) {

        inFile = new File(inPath);
        this.outPath = outPath;
        thread = new Thread(this);
    }

    @Override
    public void run() {
        findFiles(inFile, outPath, thread);
    }

    public void findFiles(File inFile, String outPath, Thread thread) {

        if (!inFile.exists()) {
            System.out.println("Папки не існує!");
            return;
        }
        // перевірка, чи це дійсно папка
        if (!inFile.isDirectory()) {
            System.out.println("Шлях не вказує на папку!");
            return;
        }
        File[] files = inFile.listFiles();
        assert files != null;
        for (File file : files) {
            if (file.isFile()) {
                copyFile(file, outPath);
                System.out.println(thread.getName());
            }
            if (file.isDirectory()) {
                StringBuilder stringBuilder = new StringBuilder(outPath).append("\\").append(file.getName());
                System.out.println(stringBuilder);
                findFiles(file,stringBuilder.toString(),new Thread());
            }
        }
    }

    public void copyFile(File inFile, String outPath) {
        File folder = new File(outPath);
        if (!folder.exists()) {
            folder.mkdir();
        }
        File newFile = new File(outPath, inFile.getName());
        try (FileInputStream fileInputStream = new FileInputStream(inFile);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)
        ) {
            FileOutputStream fileOutputStream = new FileOutputStream(newFile);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            int data;
            while ((data = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
