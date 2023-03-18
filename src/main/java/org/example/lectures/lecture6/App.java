package org.example.lectures.lecture6;

import java.io.*;

public class App {
    public static void main(String[] args) {
//        try {
//            System.out.println("Input: ");
//            System.out.println((int) 'Ф');
//            int a = System.in.read();
//            int a1 = System.in.read();
//            System.out.println(a);
//            System.out.println(a1);
//            int a2 = (a<<8) | a1;
//            System.out.println(a2);
//            System.out.println((char) a2);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            System.out.println("Input:  ");
//            int i = new InputStreamReader(System.in).read();
//            System.out.println(i);
//            System.out.println((char) i);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));){
//            System.out.println("Input string");
//            System.out.println(bufferedReader.readLine());
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
        //System.out.println(readFile("koran.txt"));
        //copyFiles("koran.txt", "utf-8", "koran1.txt", "utf-8");
        //copyFiles1("koran.txt", "utf-8", "koran2.txt", "windows-1251");
        //simpleCopyFiles("koran.txt", "koran3.txt");

        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("Data.txt"));
            DataInputStream dis = new DataInputStream(new FileInputStream("Data.txt"));){
            dos.writeDouble(673.22);
            dos.writeInt(154);
            dos.writeUTF("Hello");

            System.out.println(dis.readDouble());
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void simpleCopyFiles(String from, String to) {
        try {
            FileInputStream fin = new FileInputStream(from);
            FileOutputStream fos = new FileOutputStream(to);
            byte[] buffer = new byte[100];
            int i;
            while ((i = fin.read(buffer)) != -1) {
                fos.write(buffer, 0, i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFiles(String from, String charsetFrom, String to, String charsetTo) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(from), charsetFrom));
            PrintWriter bufferedWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(to), charsetTo));
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                bufferedWriter.println(s);
            }

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void copyFiles1(String from, String charsetFrom, String to, String charsetTo) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(from), charsetFrom));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(to), charsetTo));
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(String path) {
        StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader(path)) {
            int i;

            while ((i = fileReader.read()) != -1) {
                sb.append((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
