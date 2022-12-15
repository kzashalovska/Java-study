package FundamentalsPractice_2;

public class EasyBeforeLecture {
    String task1a;
    String task1b;

    EasyBeforeLecture(String word1, String word2) {
        task1a = word1;
        task1b = word2;
    }

    EasyBeforeLecture(String word1) {
        task1a = word1;
    }

    public void printToWordsWithoutFirstLetter(String task1a, String task1b) {
        char newWord1;
        char newWord2;
        for (int i = 1; i < task1a.length(); i++) {
            newWord1 = task1a.charAt(i);
            System.out.print(newWord1);
        }
        System.out.print(" ");
        for (int i = 1; i < task1b.length(); i++) {
            newWord2 = task1b.charAt(i);
            System.out.print(newWord2);
        }
        System.out.println();
    }

    public void printThreeLetters(String task1a) {
        int length = task1a.length();
        final int THREE = 3;
        if (length % 2 == 0) {
            System.out.println("Odd number of characters");
        } else {
            int step = (length - THREE) / 2;
            char newWord;
            for (int i = 0 + step; i < length - step; i++) {
                newWord = task1a.charAt(i);
                System.out.print(newWord);
            }
            System.out.println();

        }
    }

    public void move2LastSymbols(String task1a) {
        char newWord;
        int length = task1a.length();
        for (int i = length - 2; i < task1a.length(); i++) {
            newWord = task1a.charAt(i);
            System.out.print(newWord);
        }
        for (int i = 0; i < task1a.length() - 2; i++) {
            newWord = task1a.charAt(i);
            System.out.print(newWord);
        }
        System.out.println();
    }
}
