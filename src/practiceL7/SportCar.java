package practiceL7;

public class SportCar extends Car{
    public double speed;

    public SportCar(String carClass, String marka, Driver driver, Engine engine, double speed) {
        super(carClass, marka, driver, engine);
        this.speed = speed;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "SportCar{" +
                "speed=" + speed +
                '}';
    }
}
