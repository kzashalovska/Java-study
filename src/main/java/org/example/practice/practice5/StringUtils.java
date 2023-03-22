package org.example.practice.practice5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class StringUtils {
    public static String randomNumber(int quantity, int minInt, int maxInt) {
        StringBuilder stringBuilder = new StringBuilder();

        Random random = new Random();
        IntStream intStream = random.ints(quantity, minInt, maxInt);

        int value;

        for (Iterator<Integer> integerIterator = intStream.iterator(); integerIterator.hasNext(); ) {
            value = integerIterator.next();
            stringBuilder.append(value);
            stringBuilder.append(" ");
        }
        String s;
        s = stringBuilder.toString();
        return s;
    }

    public static void createFile(String path, String charset, String line) {

        try (BufferedWriter bufferedWriter = new BufferedWriter
                (new OutputStreamWriter(Files.newOutputStream(Paths.get(path)), charset))) {
            bufferedWriter.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(String path, String charset) {
        StringBuilder stringBuilder = new StringBuilder();
        String s;

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader
                (Files.newInputStream(Paths.get(path)), charset))) {
            while ((s = bufferedReader.readLine()) != null) {
                stringBuilder.append(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public static void sortFIleString(String path, String charset, String newPath, String newCharset) {
        String s = readFile(path, charset);
        String[] arrayString = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.sort(arrayString, new StringComparator());
        for (String a : arrayString) {
            stringBuilder.append(a);
            stringBuilder.append(" ");
        }
        String sortString = stringBuilder.toString();
        createFile(newPath, newCharset, sortString);
    }

    public static double averageRating(ArrayList<Integer> ratings) {
        int sumRating = 0;
        int count = 0;
        double averageRating;
        for (Iterator<Integer> integerIterator = ratings.iterator(); integerIterator.hasNext(); ) {
            sumRating = sumRating + integerIterator.next();
            count++;
        }
        averageRating = sumRating / count;
        return averageRating;
    }


    public static void studentsWithRating(String path, String charset, double averageRating) {
        String allText = readFile(path, charset);
        Map<String, ArrayList<Integer>> mapStudent = new HashMap<>();
        Pattern pattern = Pattern.compile("(?<name>\\w+ \\w+) = (?<rank>\\d{2})");
        Matcher matcher = pattern.matcher(allText);
        ArrayList<Integer> values;
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> calculateAverage = new ArrayList<>();


        while (matcher.find()) {

            String s = matcher.group("name");
            String value = matcher.group("rank");

            if (!mapStudent.containsKey(s)) {
                names.add(s);
                values = new ArrayList<>();
                values.add(Integer.parseInt(value));
                mapStudent.put(s, values);
            } else {
                values = mapStudent.get(s);
                values.add(Integer.parseInt(value));
            }
        }
        for (String ns : names) {
            calculateAverage = mapStudent.get(ns);
            double average = averageRating(calculateAverage);
            String[] namesSurnames = ns.split(" ");
            if (average >= averageRating) {
                System.out.println(namesSurnames[1] + " " + average);
            }
        }
    }

    public static void replaceWordInLine(String path, String charSet, String newPath, String newCharSet) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter
                (Files.newOutputStream(Paths.get(newPath)), newCharSet))) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader
                    (Files.newInputStream(Paths.get(path)), charSet));

            String s;

            while ((s = bufferedReader.readLine()) != null) {
                Pattern pattern = Pattern.compile("(?<firstWord>\\A\\w+\\b).+(?<lastWord>\\b\\w+\\S?\\Z)");
                Matcher matcher = pattern.matcher(s);

                if (matcher.find()) {
                    String firstWord = matcher.group("firstWord");
                    String lastWord = matcher.group("lastWord");
                    Pattern patternBadForLast = Pattern.compile("(\\A\\w+\\b\\W?)");
                    Matcher matcher1 = patternBadForLast.matcher(lastWord);

                    int firstSpaceIndex = s.indexOf(" ");
                    int lastSpaceIndex = s.lastIndexOf(" ");

                    if (matcher1.find()) {
                        Pattern patternGoodWord = Pattern.compile("(?<goodWord>\\A\\w+\\b)\\W");
                        Matcher matcher2 = patternGoodWord.matcher(lastWord);
                        if (matcher2.find()) {
                            lastWord = matcher2.group("goodWord");
                            int length = s.length();
                            s = lastWord + s.substring(firstSpaceIndex, lastSpaceIndex) + " " + firstWord +
                                    s.substring(length - 1);
                        } else {
                            s = lastWord + s.substring(firstSpaceIndex, lastSpaceIndex) + " " + firstWord;
                        }


                        System.out.println(s);
                    }


                }
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void replaceWordInSentence(String path, String charSet, String newPath, String newCharSet) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter
                (Files.newOutputStream(Paths.get(newPath)), newCharSet))) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader
                    (Files.newInputStream(Paths.get(path)), charSet));

            String s;

            while ((s = bufferedReader.readLine()) != null) {
                Pattern pattern = Pattern.compile("(?<firstWord>\\A\\w+\\b).+(?<lastWord>\\b\\w+\\S?\\Z)");
                Matcher matcher = pattern.matcher(s);

                if (matcher.find()) {
                    String firstWord = matcher.group("firstWord");
                    String lastWord = matcher.group("lastWord");
                    Pattern patternBadForLast = Pattern.compile("(\\A\\w+\\b\\W?)");
                    Matcher matcher1 = patternBadForLast.matcher(lastWord);

                    int firstSpaceIndex = s.indexOf(" ");
                    int lastSpaceIndex = s.lastIndexOf(" ");

                    if (matcher1.find()) {
                        Pattern patternGoodWord = Pattern.compile("(?<goodWord>\\A\\w+\\b)\\W");
                        Matcher matcher2 = patternGoodWord.matcher(lastWord);
                        if (matcher2.find()) {
                            lastWord = matcher2.group("goodWord");
                            int length = s.length();
                            s = lastWord + s.substring(firstSpaceIndex, lastSpaceIndex) + " " + firstWord +
                                    s.substring(length - 1);
                        } else {
                            s = lastWord + s.substring(firstSpaceIndex, lastSpaceIndex) + " " + firstWord;
                        }


                        System.out.println(s);
                    }


                }
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
