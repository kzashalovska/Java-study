package FundamentalsPractice_7.FundamentalsPractice_4;

public class Phone {
    String number;
    String model;
    double weight;

    Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    Phone(String number, String model) {
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

    public void receiveCall(String name, String number) {
        System.out.println("method receiveCall, send number and name");
        System.out.println("Call " + name + "\n" + number);
        System.out.println();
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... number) {
        System.out.println("Print number for send message (method: sendMessage");
        for (String x : number) System.out.print(x + "\n");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
