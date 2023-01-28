package org.example.practice.practice2.easyTask;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    public static ArrayList<NameRank> parseName(String fileName) throws IOException {
        ArrayList<NameRank> groupNames = new ArrayList<NameRank>();
        String allText = readFile(fileName);
        Pattern pattern = Pattern.compile("<tr align=\"right\"><td>(?<rank>\\d{1,4})<\\/td><td>" +
                "(?<malename>\\w+)<\\/td><td>(?<femalename>\\w+)<\\/td>");
        Matcher matcher = pattern.matcher(allText);
        while (matcher.find()) {
            groupNames.add(new NameRank(matcher.group("rank"), matcher.group("malename"),
                    matcher.group("femalename")));
        }
        return groupNames;
    }

    public static String readFile(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName),
                ("windows-1251")));
        String text = null;
        StringBuilder stringBuilder = new StringBuilder();
        while ((text = bufferedReader.readLine()) != null) {
            stringBuilder.append(text);
        }
        text = stringBuilder.toString();
        return text;
    }
}
