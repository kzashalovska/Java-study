package FundamentalsLecture_9;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static final String INPUT_HUMAN_S_AGE = "Input human`s age: ";

    public static void main(String[] args) throws IOException {
        //System.out.println(createHumanConsole());
        System.out.println(createHumanConsoleVal());
    }

    private static Human createHumanConsoleVal() {
        Human human = new Human();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new UnClosedStream(System.in)))) {

            while (true) {
                try {
                    System.out.println("Input human`s name: ");
                    human.setName(br.readLine());
                    break;
                } catch (HumanNameException e) {
                    System.out.println(e.getMessage());
                }
            }
            while (true) {
                try {
                    try {
                        human.setAge(readNumber(br, INPUT_HUMAN_S_AGE));
                        break;
                    } catch (HumanAgeException e) {
                        System.out.println(e.getMessage());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return human;
    }

    private static Human createHumanConsole() {
        Human human = null;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new UnClosedStream(System.in)))) {
            System.out.println("Input human`s name: ");
            String name = null;
            name = br.readLine();
            int age = readNumber(br, INPUT_HUMAN_S_AGE);
            while (true) {
                try {
                    human = new Human(name, age);
                    break;
                } catch (HumanAgeException e) {
                    System.out.println(e.getMessage());
                    age = readNumber(br, INPUT_HUMAN_S_AGE);
                } catch (HumanNameException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Input human`s name: ");
                    name = br.readLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return human;

    }

    public static int readNumber(BufferedReader br, String message) throws IOException {
        int number;
        while (true) {
            try {
                System.out.println(message);
                number = Integer.parseInt(br.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not a number, try again: ");
            }
        }
        return number;
    }
}
