package practice1;

import java.util.Locale;

import static java.lang.Math.pow;

public class Credit {

    public static void main(String[] args) {

        // КЛАСИЧНИЙ МЕТОД РОЗРАХУНКУ
        int period = 24;
        float interest = 32.5F;
        final float mounthlyPay = interest / 100 / 12;
        float creditSum = 150000.00F;
        float bodyPay = creditSum / period;
        float allInterestPay = 0;

        // Цикл розраховує розмір щомісячного платежу за тілом і відсотки
        for (int i = 1; i <= period; i++) {
            System.out.println("Сума оплати тіла кредиту за місяць " + i + ": " + getFormat(bodyPay));
            float percentpay = creditSum * mounthlyPay; // Сума сплати відсотків у місяць
            System.out.println("Сума оплати відсотків за місяць " + i + ": " + getFormat(percentpay));
            creditSum = creditSum - bodyPay; // Зміна розміру тіла кредиту після сплати ануїтетного платежу
            allInterestPay = allInterestPay + percentpay; // Підрахунок загальної суми сплачених відсотків
        }
        // Вивід на екран загальної суми сплачених відсотків
        System.out.println("Загальна сума відсотків: " + getFormat(allInterestPay));

        //АНУЇТЕТНИЙ МЕТОД РОЗРАХУНКУ

        // Розрахунок ануїтетного коефіцієнту
        double annuityСoefficient = (mounthlyPay * getPow(period, mounthlyPay)) / (getPow(period, mounthlyPay) - 1);
        float creditSum2 = 150000.00F;
        float monthPay = (float) (creditSum2 * annuityСoefficient);
        float bodyPay2;
        float allPercent2 = 0;
        for (int i = 1; i <= period; i++) {
            float percentPay = creditSum2 * mounthlyPay;
            bodyPay2 = monthPay - percentPay;
            System.out.println("Сума оплати тіла кредиту за місяць " + i + ": " + getFormat(bodyPay2));
            creditSum2 = creditSum2 - bodyPay2;
            allPercent2 = allPercent2 + percentPay;
            System.out.println("Сума оплати відсотків за місяць " + i + ": " + getFormat(percentPay));
        }
        System.out.println("Загальна сума відсотків: " + getFormat(allPercent2));
    }

    private static double getPow(int period, float mounthlyPay) {
        return pow((1 + mounthlyPay), period);
    }

    private static String getFormat(float amount) {
        return String.format(Locale.ENGLISH, "%(.2f", amount);
    }
}
