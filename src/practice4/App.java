package practice4;

public class App {
    public static void main(String[] args) {
        System.out.println("WORK WITH CLASS PHONE" + "\n");
        String model1 = "Xiaomi";
        String model2 = "Samsung";
        double weight1 = 145.2;
        double weight3 = 132.4;
        double weight2 = 125.8;
        // How write "0" first symbol into changeable?
        String numberKolya = "0661583104";
        String numberNikita = "0661746568";
        String numberTanya = "0999537357";

        Phone telefonKolya = new Phone(numberKolya, model2, weight1);
        Phone telefonNikita = new Phone(numberNikita, model1, weight2);
        Phone telefonTanya = new Phone(numberTanya, model2, weight3);

        System.out.println("Number = " + telefonKolya.number + " model = "
                + telefonNikita.model + " weight = " + telefonKolya.weight);
        System.out.println("Number = " + telefonNikita.number + " model = "
                + telefonNikita.model + " weight = " + telefonNikita.weight);
        System.out.println("Number = " + telefonTanya.number + " model = "
                + telefonTanya.model + " weight = " + telefonTanya.weight + "\n");

        final String name1 = "Kolya";
        final String name2 = "Nikita";
        final String name3 = "Tanya";

        telefonKolya.receiveCall(name1);
        telefonKolya.receiveCall(name1, numberKolya);
        final String number1 = telefonKolya.getNumber();
        System.out.println("print number with method getNumber:");
        System.out.println(number1 + "\n");
        telefonNikita.receiveCall(name2);
        telefonKolya.receiveCall(name2, numberNikita);
        final String number2 = telefonNikita.getNumber();
        System.out.println("print number with method getNumber:");
        System.out.println(number2 + "\n");
        telefonTanya.receiveCall(name3);
        telefonKolya.receiveCall(name3, numberTanya);
        final String number3 = telefonTanya.getNumber();
        System.out.println("print number with method getNumber:");
        System.out.println(number3 + "\n");
        telefonTanya.sendMessage(number1, number2);

        System.out.println("WORK WITH CLASS PERSON" + "\n");

        Person user1 = new Person("Petrenko Petr Petrovich", 32);
        Person user2 = new Person();
        user2.move();

        user1.talk();
        user1.move();

    }
}
