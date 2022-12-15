package FundamentalsPractice_3;

public class CommissionWorker extends Employee{
    private double weekSalary;
    private double baseSalary = 1000.00;
    private double percentCommission = 0.05;
    private double amountOfSales;


    public CommissionWorker(String name, String surname, double amountOfSales) {
        super(name, surname);
        this.amountOfSales = amountOfSales;
    }



    @Override
    public double calculateSalary() {
        weekSalary = baseSalary + amountOfSales*percentCommission;
        return weekSalary;
    }

    @Override
    public String convertSalary() {
        String result = String.format("%.2f",weekSalary);
        return result;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }

    public double getAmountOfSales() {
        return amountOfSales;
    }

    public void setAmountOfSales(int amountOfSales) {
        this.amountOfSales = amountOfSales;
    }

    @Override
    public String toString() {
        return "CommissionWorker{" + "name = '" + getName() + '\'' +
                ", surname = '" + getSurname() + '\'' +
                ", weekSalary = " + convertSalary() +
                '}';
    }
}
