package ua.denys.programming.lectures.lecture2;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class App2 {
    public static void main(String[] args) {
        try (Read read = new Read(new FileReader("name.txt"));
            Write write = new Write(new FileWriter("name.txt"))){
            int character =  read.read();
            write.write(character);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("~~~~~~~~~~~~~~~");
            Arrays.asList(e.getSuppressed()).forEach(System.out::println);

        }
    }
}
