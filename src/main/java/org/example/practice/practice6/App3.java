package org.example.practice.practice6;

public class App3 {
    public static void main(String[] args) {
        FileUtils fileUtils = new FileUtils("D:\\photo", "logOut.txt", ".+.jpg");
        fileUtils.start();
    }
}
