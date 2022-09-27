package practice2;

public class MiddlePlus {

    public static int quantityEndLetter(String str) {
        int quan = 0;
        String[] words = str.split(" ");
        for (String word : words) {
            int length = word.length();
            char ch = word.charAt(length - 1);

            if (ch == 's' || ch == 'a' || ch == 'S' || ch == 'A') {
                quan++;
            }
            if ((ch < 48 & ch > 32) || (ch < 65 & ch > 57) || (ch < 127 & ch > 122)) {
                ch = word.charAt(length - 2);
                if (ch == 's' || ch == 'a' || ch == 'S' || ch == 'A') {
                    quan++;
                }
            }
        }
        return quan;
    }

    public static void charsDelete(String str, String underString) {
        StringBuilder sb = new StringBuilder(str);
        int lengthMask = underString.length();
        int length = sb.length();
        char[] mask = new char[lengthMask];
        char[] oldString = new char[length];

        for (int i = 0; i < lengthMask; i++) {
            mask[i] = underString.charAt(i);
        }
        for (int i = 0; i < length; i++) {
            oldString[i] = sb.charAt(i);
        }
        int j;
        int count = 0;
        int deleteCursor = 0;
        final int lengthDiferent = length - lengthMask;
        for (int l = 0; l < lengthDiferent; l++) {
            j = count;
            for (int i = 0; i < lengthMask; ) {
                if (mask[i] == oldString[j]) {
                    i++;
                    j++;
                } else {
                    count++;
                    break;
                }
                if (i == lengthMask) {
                    int saveCount = count - lengthMask * deleteCursor;
                    for (int k = 0; k < lengthMask; k++) {
                        sb.delete(saveCount, saveCount + 1);
                    }
                    deleteCursor++;
                    count = count + 2;
                }
            }
            if (count >= lengthDiferent + 1)
                break;
        }
        System.out.println(sb);
    }
}
