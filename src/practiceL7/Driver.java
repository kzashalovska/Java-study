package practiceL7;

public class Driver extends Person{
    public int experience;

    public Driver(int age, String fullName, int experience) {
        super(age, fullName);
        this.experience = experience;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Driver{" +
                "experience=" + experience +
                '}';
    }
}
