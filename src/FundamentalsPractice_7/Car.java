package FundamentalsPractice_7;

public class Car {
    public String carClass;
    public String marka;
    Driver driver;
    Engine engine;

    public Car(String carClass, String marka, Driver driver, Engine engine) {
        this.carClass = carClass;
        this.marka = marka;
        this.driver = driver;
        this.engine = engine;
    }

    public void start(){
        System.out.println("Поехали");
    }
    public void stop(){
        System.out.println("Останавливаемся");
    }
    public void  turnRight(){
        System.out.println("Поворот направо");
    }
    public void  turnLeft(){
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        System.out.println(driver.toString());
        System.out.println(engine.toString());
        return "Car{" +
                "carClass='" + carClass + '\'' +
                ", marka='" + marka + '\'' +
                '}';
    }
}
