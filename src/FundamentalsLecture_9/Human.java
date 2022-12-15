package FundamentalsLecture_9;

public class Human {
    private static final byte MIN_NAME_LENGTH = 2;
    private String name;
    private byte age;
    private static byte MIN_AGE = 0;
    private static byte MAX_AGE = 100;

    public Human(){

    }
    public Human(String name, int age) throws HumanAgeException, HumanNameException {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws HumanNameException {
        if (name.length() > MIN_NAME_LENGTH){
        this.name = name;
    }else {
            throw new HumanNameException("Wrong name length, use more than "+ MIN_NAME_LENGTH);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws HumanAgeException {
        if (age > MIN_AGE && age < MAX_AGE) {
            this.age = (byte) age;
        } else {
           throw new HumanAgeException("Wrong age, use age from " + MIN_AGE + " to " + MAX_AGE);
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
