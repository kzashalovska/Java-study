package org.example.practice.practice4.textTask;

import java.io.*;
import java.util.*;

public class Parser {
    public static Map<String, Count> readFile(String fileName) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName),
                    ("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String text = null;
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            try {
                if (!((text = bufferedReader.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stringBuilder.append(text);
        }
        text = stringBuilder.toString();
        String[] newText = text.split(" ");

        Map<String, Count> stringCountMap = new HashMap<>();
        for (String word : newText) {
            if (stringCountMap.containsKey(word)) {
                Count count = stringCountMap.get(word);
                count.upCount();
            } else {
                stringCountMap.put(word, new Count());
            }
        }
        return stringCountMap;
    }

    public static void readFile(String fileName, Sort sort) {
        Map<String, Count> forSortedMap = readFile(fileName);
        List<Map.Entry<String, Count>> listMapEntry = new ArrayList(forSortedMap.entrySet());
        Comparator<Map.Entry<String, Count>> entryComparator = null;
        switch (sort) {
            case COUNTUP:
                entryComparator = Comparator.comparing(a -> a.getValue().getInteger());
                break;
            case COUNTDOWN:
                entryComparator = (a, b) -> b.getValue().getInteger().compareTo(a.getValue().getInteger());
                break;
            case LETTERUP:
                entryComparator = Comparator.comparing(Map.Entry::getKey);
                break;
            case LETTERDOWN:
                entryComparator = (a, b) -> b.getKey().compareTo(a.getKey());
                break;
        }
        listMapEntry.sort(entryComparator);
        System.out.println(listMapEntry);
    }


}
