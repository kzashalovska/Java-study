package practice1;

import java.util.Locale;

import static java.lang.Math.pow;

public class Credit {

    public static void main(String[] args) {

        // КЛАСИЧНИЙ МЕТОД РОЗРАХУНКУ
        int period = 24; // період кредитування
        float percent = 32.5F; // процентна ставка
        float credit = 150000.00F; //сума кредиту
        float bodypay = credit/period; // Змінна для зберігання щомісяного платежу по тілу кредиту
        float allpercent = 0; // Змінна для підрахунку загальної суми відсотків

        // Цикл розраховує розмір щомісячного платежу за тілом і відсотки
        for ( int i = 1; i <= period; i++) {
            // Вивід на екран інформації про сплачену суму тіла кредиту за місяць
            System.out.println("Сума оплати тіла кредиту за місяць " + i + ": " + (String.format(Locale.ENGLISH, "%(.2f", bodypay)));
            float percentpay = credit * percent/100/12; // Сума сплати відсотків у місяць
            // Вивід на екран щомісячної суми сплачених відсотків
            System.out.println("Сума оплати відсотків за місяць " + i + ": " + (String.format(Locale.ENGLISH, "%(.2f", percentpay)));
            credit = credit - bodypay; // Зміна розміру тіла кредиту після сплати ануїтетного платежу
            allpercent = allpercent + percentpay; // Підрахунок загальної суми сплачених відсотків
        }
        // Вивід на екран загальної суми сплачених відсотків
        System.out.println("Загальна сума відсотків: " + (String.format(Locale.ENGLISH, "%(.2f", allpercent)));

        //АНУЇТЕТНИЙ МЕТОД РОЗРАХУНКУ
        // Розрахунок ануїтетного коефіцієнту
        double k = (percent/100/12 * pow((1+percent/100/12), period)) / (pow((1 + percent/100/12), period) - 1);
        float credit2 = 150000.00F; // Сума кредиту для другого варіанта
        float monthpay = (float) (credit2 * k); // Розмір щомісяного платежу
        float sumcredit = period * monthpay; // Загальна сума кредиту
        float bodypay2; // Змінна для зберігання щомісяного платежу по тілу кредиту
        float allpercent2 = 0; // Змінна для підрахунку загальної суми відсотків
        // Цикл підраховучий щомісячні платежі по тілу та відсоткам
        for (int i = 1; i <= period; i++){
            float percentpay = credit2 * percent/100/12; // Сума сплати відсотків у місяць
            bodypay2 = monthpay - percentpay; // Сума сплати тіла кредиту в місяць
            // Вивід на екран інформації про сплачену суму тіла кредиту за місяць
            System.out.println("Сума оплати тіла кредиту за місяць " + i + ": " + (String.format(Locale.ENGLISH, "%(.2f", bodypay2)));
            credit2 = credit2 - bodypay2; // Зміна розміру тіла кредиту після сплати ануїтетного платежу
            allpercent2 = allpercent2 + percentpay; // Підрахунок загальної суми сплачених відсотків
            // Вивід на екран щомісячної суми сплачених відсотків
            System.out.println("Сума оплати відсотків за місяць " + i + ": " + (String.format(Locale.ENGLISH, "%(.2f", percentpay)));
        }
        // Вивід на екран загальної суми сплачених відсотків
        System.out.println("Загальна сума відсотків: " + (String.format(Locale.ENGLISH, "%(.2f", allpercent2)));







    }



}
