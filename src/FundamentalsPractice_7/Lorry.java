package FundamentalsPractice_7;

public class Lorry extends Car{
    public int carrying;

    public Lorry(String carClass, String marka, Driver driver, Engine engine, int carrying) {
        super(carClass, marka, driver, engine);
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Lorry{" +
                "carrying=" + carrying +
                '}';
    }
}
