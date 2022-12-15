package FundamentalsPractice_2;

public class Middle {
    public static String doubleLetter(String str) {
        StringBuilder sb = new StringBuilder();
        String newWord;
        final int COUNT_LETTER = 2;
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            for (int j = 0; j < COUNT_LETTER; j++) {
                sb.append(symbol);
            }
        }
        newWord = String.valueOf(sb);
        return newWord;
    }

    public static int quantity(String str) {
        int quan = 0;
        String[] words = str.split(" ");
        for (String word : words) {
            boolean s1 = word.startsWith("b");
            boolean s2 = word.endsWith("b");
            if (s1 == true & s2 == true & word.length() == 3) {
                quan++;
            }
        }
        return quan;
    }

    public static String deleteAroundMask(String text, String str) {
        StringBuffer sb = new StringBuffer(text);
        int index = 0;

        while (true) {
            index = sb.indexOf(str, index);
            if (index != -1) {
                sb.delete(index - 1, index+2);
                index = 0;
            } else {
                break;
            }
        }
        String newString = String.valueOf(sb);
        return newString;
    }
}
