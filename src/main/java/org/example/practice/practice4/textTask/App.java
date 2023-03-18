package org.example.practice.practice4.textTask;

import static org.example.practice.practice4.textTask.Parser.readFile;

public class App {
    public static void main(String[] args) {
        //System.out.println(readFile("xueqin1.txt"));
        //readFile("xueqin1.txt", Sort.COUNTDOWN);
        readFile("xueqin1.txt", Sort.COUNTUP);
        //readFile("xueqin1.txt", Sort.LETTERDOWN);
        //readFile("xueqin1.txt", Sort.LETTERUP);

    }
}
