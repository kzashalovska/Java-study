package FundamentalsLecture_4;

public class Human {
    public String name;
    public int age;
    public static String type = "Homo Sapiens";

    public Human() {
    }

    public Human(String newName) {
        this(newName, 1);
    }
    public Human(String newName, int newAge) {
        this.name = newName;
        this.age = newAge;
    }

    public void sayHello(){
        System.out.println("Hello my name is " + name);
    }

    public void born(){
        System.out.println("I was born!!!");
        sayHello();
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
