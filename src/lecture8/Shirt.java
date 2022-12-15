package lecture8;

public class Shirt extends Clothing {
    private int size;

    public Shirt(String name, int price, int size) {
        super(name, price);
        setSize(size);
    }

    @Override
    public String howToClean() {
        return "30 degree";
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void wash() {
        System.out.println("Shirt is clean");
    }

    @Override
    public String toString() {
        return "Shirt{"+ "name='" + getName() + '\'' +
                ", price=" + getPrice() + '\'' +
                ", size=" + size +
                '}';
    }
}
