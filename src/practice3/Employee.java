package practice3;

public abstract class Employee implements Comparable<Employee> {
    private String name;
    private String surname;


    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    abstract public double calculateSalary();

    abstract public String convertSalary();

    @Override
    public int compareTo(Employee o) {
        return (int) (this.calculateSalary() - o.calculateSalary());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    @Override
    public abstract String toString();

}
