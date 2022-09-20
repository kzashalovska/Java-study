package practice4;

public class Person {
    String fullName;
    int age;

    Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;

    }

    Person() {
        fullName = "No name";
        age = 0;
        System.out.println("User no write name");
    }

    public void talk() {
        System.out.println(fullName + " talk about your age, he is " + age);
    }

    public void move() {
        if (fullName == "No name")
            System.out.println("User no have name and age");
        else {
            age += 1;
            System.out.println("I have grown old" + "\n" + "I am " + age);
        }
    }
}
