package practice4;

public class Phone {
    long number;
    String model;
    double weight;

    Phone(long number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // method no used, but the task has a task to use this
    // constructor in a constructor that has three arguments
    Phone(long number, String model) {
        this.number = number;
        this.model = model;
        this.weight = -1;
    }

    // method no used, this is task condition
    Phone() {
        System.out.println("Number not detected");
    }

    public void receiveCall(String name) {
        System.out.println("method receiveCall, send name");
        System.out.println("Call " + name);
        System.out.println();
    }

    public void receiveCall(String name, int number) {
        System.out.println("method receiveCall, send number and name");
        System.out.println("Call " + name + "\n" + number);
        System.out.println();
    }

    public long getNumber() {
        return number;
    }

    public void sendMessage(long... number) {
        System.out.println("Print number for send message (method: sendMessage");
        for (long x : number) System.out.print(x + "\n");
        System.out.println();
    }
}
