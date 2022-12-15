package FundamentalsLecture_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App2 {
    public static void main(String[] args) throws IOException {
        System.out.println(createHumanConsole());
    }

    private static Human createHumanConsole() throws IOException {
        Human human = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input human`s name: ");
        String name = br.readLine();
        System.out.println("Input human`s age: ");
        int age = Integer.parseInt(br.readLine());
        return new Human(name, age);

    }
}
