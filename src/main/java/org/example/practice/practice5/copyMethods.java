package org.example.practice.practice5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class copyMethods {
    public static void bufferedCharCopy(String path, String charSet, String newPath, String newCharSet) {
        long start = System.currentTimeMillis();
        try (BufferedWriter bufferedWriter = new BufferedWriter
                (new OutputStreamWriter(Files.newOutputStream(Paths.get(newPath)), newCharSet));) {
            BufferedReader bufferedReader = new BufferedReader
                    (new InputStreamReader(Files.newInputStream(Paths.get(path)), charSet));

            String s;
            while ((s = bufferedReader.readLine()) != null) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time);
    }

    public static void noBufferedCharCopy(String path, String newPath) {
        long start = System.currentTimeMillis();
        try (FileReader fileReader = new FileReader(path);
             FileWriter fileWriter = new FileWriter(newPath);) {
            int i;
            while ((i = fileReader.read()) != -1) {
                fileWriter.write(i);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time);
    }

    public static void noBufferedByteCopy(String path, String newPath) {
        long start = System.currentTimeMillis();
        try {
            FileInputStream fin = new FileInputStream(path);
            FileOutputStream fos = new FileOutputStream(newPath);
            byte[] buffer = new byte[100];
            int i;
            while ((i = fin.read(buffer)) != -1) {
                fos.write(buffer, 0, i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time);
    }

    public static void bufferedByteCopy(String path, String newPath) {


        long start = System.currentTimeMillis();
        try (InputStream inputStream = Files.newInputStream(Paths.get(path));
             BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream)
        ) {
            OutputStream outputStream = Files.newOutputStream(Paths.get(newPath));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            int data;
            while ((data = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        long time = end-start;
        System.out.println(time);
    }
}

