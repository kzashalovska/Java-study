package FundamentalsPractice_2;

public class EasyAfterLecture {

    public static String minusFirstLetter(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.delete(0, 1);
        String letterMinus = sb.toString();
        return letterMinus;
    }

    public static String oddSymbolDelete(String str) {
        int length = str.length();
        String letterThree;
        if (length % 2 == 0 && length <= 3) {
            letterThree = "Odd number of characters";
            return letterThree;
        } else {
            int step = (length - 3) / 2;
            letterThree = str.substring(step, length - step);
            return letterThree;
        }
    }

    public static String removeLetter (String str) {
        StringBuilder sb = new StringBuilder(str);
        int length = str.length();
        sb.insert(0,str.charAt(length-1));
        sb.insert(0,str.charAt(length-2));
        sb.delete(length,length+2);
        String symbolRemove = String.valueOf(sb);
        return symbolRemove;
    }
}
