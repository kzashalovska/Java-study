package FundamentalsPractice_3;

public class Boss extends Employee{
    private double weekSalary = 4000.00;



    public Boss(String name, String surname) {
        super(name, surname);
    }

    @Override
    public double calculateSalary() {
        return weekSalary;
    }

    @Override
    public String convertSalary() {
        String result = String.format("%.2f",calculateSalary());
        return result;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }

    @Override
    public String toString() {
        return "Boss {" + "name = '" + getName() + '\'' +
                ", surname = '" + getSurname() + '\'' +
                ", weekSalary = " + convertSalary() +
                '}';
    }
}
