package FundamentalsPractice_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Hard {

    public static void temperatureInfo() {
        System.out.println("Please choose month of year: \nJanuary input 1;\nFebruary input 2;\nMart input 3;\n" +
                "April input 4;\nMay input 5;\nJune input 6;\nJuly input 7;\nAugust input 8;\nSeptember input 9;\n" +
                "October input 10;\nNovember input 11;\nDecember input 12;\n");
        Scanner mont = new Scanner(System.in);
        Scanner temperatureScan = new Scanner(System.in);
        byte month;
        do {
            System.out.print("Input a number: ");
            month = mont.nextByte();
        } while (month > 12 || month < 1);
        byte date = 1;
        byte dateMin = 0;
        byte dateMax = 0;
        double temperature;
        double temperatureAver;
        double temperatureSum = 0;
        double temperatureMin = 101;
        double temperatureMax = -101;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            ArrayList<Double> temperatureInfo = new ArrayList<>(31);

            do {
                System.out.println("Enter the temperature (℃) that was on the " + date + ": ");
                temperatureInfo.add(temperatureScan.nextDouble());
                date++;
            } while (date < 32);
            for (double dayTemp : temperatureInfo) {
                temperatureSum = temperatureSum + dayTemp;
                if (dayTemp < temperatureMin) {
                    temperatureMin = dayTemp;
                    dateMin = (byte) (dayTemp + 1);
                }
                if (dayTemp > temperatureMax) {
                    temperatureMax = dayTemp;
                    dateMax = (byte) (dayTemp + 1);
                }
            }
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            ArrayList<Double> temperatureInfo = new ArrayList<>(30);

            do {
                System.out.println("Enter the temperature (℃) that was on the " + date + ": ");
                temperatureInfo.add(temperatureScan.nextDouble());
                date++;
            } while (date < 31);
            byte i = 0;
            for (double b : temperatureInfo) {
                temperature = temperatureInfo.get(i);
                temperatureSum = temperatureSum + temperature;
                if (temperature < temperatureMin) {
                    temperatureMin = temperature;
                    dateMin = (byte) (i + 1);
                }
                if (temperature > temperatureMax) {
                    temperatureMax = temperature;
                    dateMax = (byte) (i + 1);
                }
                i++;
            }
        }
        else {
            ArrayList<Double> temperatureInfo = new ArrayList<>(28);

            do {
                System.out.println("Enter the temperature (℃) that was on the " + date + ": ");
                temperatureInfo.add(temperatureScan.nextDouble());
                date++;
            } while (date < 29);
            byte i = 0;
            for (double b : temperatureInfo) {
                temperature = temperatureInfo.get(i);
                temperatureSum = temperatureSum + temperature;
                if (temperature < temperatureMin) {
                    temperatureMin = temperature;
                    dateMin = (byte) (i + 1);
                }
                if (temperature > temperatureMax) {
                    temperatureMax = temperature;
                    dateMax = (byte) (i + 1);
                }
                i++;
            }
        }
        temperatureAver = temperatureSum / (date - 1);
        String temperatureAverString = String.format("%.1f", temperatureAver);
        System.out.println("The average temperature was: " + temperatureAverString + "℃");
        String temperatureMinString = String.format("%.1f", temperatureMin);
        System.out.println("The minimum temperature was: " + temperatureMinString + "℃. " +
                "It was on the " + dateMin);
        String temperatureMaxString = String.format("%.1f", temperatureMax);
        System.out.println("The maximum temperature was: " + temperatureMaxString + "℃. " +
                "It was on the " + dateMax);
    }
}
