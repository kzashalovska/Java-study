package lecture5;

public class Human {
    private String name;
    private byte age;
    private static byte MIN_AGE = 0;
    private static byte MAX_AGE = 100;

    public Human(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > MIN_AGE && age < MAX_AGE) {
            this.age = (byte) age;
        } else {
            System.out.println("Wrong age, use age from " + MIN_AGE + " to " + MAX_AGE);
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
