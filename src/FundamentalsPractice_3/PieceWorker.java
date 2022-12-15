package FundamentalsPractice_3;

public class PieceWorker extends Employee{

    private int quantityDetails;
    private double weekSalary;
    private double detailsSalary = 7.52;
    public PieceWorker(String name, String surname, int quantityDetails) {
        super(name, surname);
        this.quantityDetails = quantityDetails;
    }


    @Override
    public double calculateSalary() {
        weekSalary = detailsSalary * quantityDetails;
        return weekSalary;
    }

    @Override
    public String convertSalary() {
        String result = String.format("%.2f",weekSalary);
        return result;
    }

    public int getQuantityDetails() {
        return quantityDetails;
    }

    public void setQuantityDetails(int quantityDetails) {
        this.quantityDetails = quantityDetails;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }

    @Override
    public String toString() {
        return "PieceWorker {" + "name = '" + getName() + '\'' +
                ", surname = '" + getSurname() + '\'' +
                ", weekSalary = " + convertSalary() +
                '}';
    }
}
