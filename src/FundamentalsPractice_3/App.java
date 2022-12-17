package FundamentalsPractice_3;

import java.util.Arrays;
// main file for task 3. Inheritance
public class App {
    public static double totalSalary = 0;
    public static void main(String[] args) {

        Employee[] employees = {
                new Boss("Denys", "Yevdokimov"),
                new HourlyWorker("Denys", "Vakulenko", 43),
                new HourlyWorker("Denys", "Vakulenko1", 46),
                new HourlyWorker("Denys", "Vakulenko2", 26),
                new PieceWorker("Denys", "Haievskiy", 460),
                new PieceWorker("Denys", "Haievskiy1", 350),
                new PieceWorker("Denys", "Haievskiy2", 410),
                new CommissionWorker("Denys", "Familnuy", 65000),
                new CommissionWorker("Denys", "Familnuy1", 15000),
                new CommissionWorker("Denys", "Familnuy2", 29500)
        };
        Arrays.sort(employees);

        for (Employee clothing1 : employees) {
            System.out.println(clothing1);
            totalSalary = clothing1.calculateSalary() + totalSalary;
        }
        System.out.printf("Total salary = "+"%.2f %n", totalSalary);

    }
}
