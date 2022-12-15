package FundamentalsPractice_3;

public class HourlyWorker extends Employee{

    private int normalHour = 40;
    private double coefficient = 1.75;
    private int hourWork;
    private double weekSalary;
    private double hourSalary = 70.00;



    public HourlyWorker(String name, String surname, int hourWork) {
        super(name, surname);
        this.hourWork = hourWork;
    }



    @Override
    public double calculateSalary() {
            if (hourWork<=normalHour)
        {
            weekSalary = hourWork * hourSalary;
        } else if (hourWork > normalHour) {
            weekSalary = hourWork * hourSalary + (hourWork - normalHour) * hourSalary * coefficient;
        }
        return weekSalary;
    }

    @Override
    public String convertSalary() {
        String result = String.format("%.2f",weekSalary);
        return result;
    }

    public int getNormalHour() {
        return normalHour;
    }

    public void setNormalHour(int normalHour) {
        this.normalHour = normalHour;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public int getHourWork() {
        return hourWork;
    }

    public void setHourWork(int hourWork) {
        this.hourWork = hourWork;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }

    public double getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }

    @Override
    public String toString() {
        return "HourlyWorker {" + "name = '" + getName() + '\'' +
                ", surname = '" + getSurname() + '\'' +
                ", weekSalary = " + convertSalary() +
                '}';
    }
}
