package org.example.practice.practice2.easyTask;

import java.io.IOException;

public class TestParser {
    public static void main(String[] args) throws IOException {
        Parser testParser = new Parser();
        System.out.println(testParser.parseName("baby2008.html"));
    }
}
