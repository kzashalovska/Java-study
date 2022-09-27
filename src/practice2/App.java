package practice2;
import java.util.Scanner;

// In this task console print right answer of EasyTask, but this answer not new String.
// console print many chars. But I not now how make new String.
public class App {
    public static void main(String[] args) {
        System.out.println("EASY_BEFORE_LECTURE TASK\n");

        String city1 = "KHarkiv";
        String city2 = "KHerson";
        EasyBeforeLecture task1_1 = new EasyBeforeLecture(city1, city2);
        task1_1.printToWordsWithoutFirstLetter(city1, city2);

        String easyTask2 = "Toronto";
        String easyTask2b = "Kyiv";
        EasyBeforeLecture task1_2 = new EasyBeforeLecture(easyTask2);
        task1_2.printThreeLetters(easyTask2);
        EasyBeforeLecture task1_2b = new EasyBeforeLecture(easyTask2b);
        task1_2b.printThreeLetters(easyTask2b);

        String easyTask3 = "London is the capital of Great Britain";
        EasyBeforeLecture task1_3 = new EasyBeforeLecture(easyTask3);
        task1_3.move2LastSymbols(easyTask3);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~\nEASY_AFTER_LECTURE TASK\n");

        String firstStr = "KHarkiv";
        String secondStr = "KHerson";
        EasyAfterLecture word = new EasyAfterLecture();
        firstStr = word.minusFirstLetter(firstStr);
        secondStr = word.minusFirstLetter(secondStr);
        String twoWords = firstStr + " " + secondStr;
        System.out.println(twoWords);

        String oddSymbol = "Toronto";
        String oddSymbol2 = "Kyiv";
        oddSymbol = word.oddSymbolDelete(oddSymbol);
        oddSymbol2 = word.oddSymbolDelete(oddSymbol2);
        System.out.println(oddSymbol);
        System.out.println(oddSymbol2);

        String longStr = "London is the capital of Great Britain";
        longStr = word.removeLetter(longStr);
        System.out.println(longStr);

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\nMIDDLE TASK\n");

        String middleTask1 = "Candy";
        Middle forMiddleTask = new Middle();
        middleTask1 = forMiddleTask.doubleLetter(middleTask1);
        System.out.println(middleTask1);

        String middleTask2 = "bob is bib biob";
        int quantityWords = forMiddleTask.quantity(middleTask2);
        System.out.println("In string: " + "\"" + middleTask2 + "\"" +
                "." + " Words with a mask \"b*b\": " + quantityWords);

        String middleTask3 = "th*is is sum*mer dum*mer";
        String mask = "*";
        String newString = forMiddleTask.deleteAroundMask(middleTask3, mask);
        System.out.println(newString);

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\nMIDDLE+ TASK\n");

        String middleTaskPlus1 = "Java is an object oriented language which gives a clear structure" +
                " to programs and allows code to be reused, lowering development costs";
        MiddlePlus stringAnaliz = new MiddlePlus();
        int i = stringAnaliz.quantityEndLetter(middleTaskPlus1);
        System.out.println("Quantity word, which end letters 'a' and 's': " + i);

        // The task was solved by logic, but I think that String or StringBuilder
        // has a method that would greatly simplify this task.
        String  middleTaskPlus2 = "Java is an object oriented language which gives a clear structure" +
                " to programs and allows code to be reused, lowering development costs";
        String underString = "ed";
        stringAnaliz.charsDelete(middleTaskPlus2, underString);

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~\nHARD TASK\n");

        Hard.temperatureInfo();
    }
}
