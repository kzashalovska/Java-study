package practiceL7;

public class App1 {
    public static void main(String[] args) {
        Driver driver1 = new Driver(35,"Petrenko Petro", 12);
        Engine engine1 = new Engine(125, "GMC");
        Car car1 = new Car("Passenger car", "Ford", driver1,engine1);
        System.out.println(car1.toString());
        System.out.println();

        Driver driver2 = new Driver(42,"Ivanenko Petro", 24);
        Engine engine2 = new Engine(480, "Renault");
        Car car2 = new Lorry("Truck", "Renault", driver2,engine2, 40000 );
        System.out.println(car2.toString());
    }
}
