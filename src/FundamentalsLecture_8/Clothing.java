package FundamentalsLecture_8;

abstract public class Clothing implements Cleanable, Comparable<Clothing>{
    private String name;
    private int price;

    public Clothing(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Clothing o) {
        return this.price - o.price;
    }

    abstract public void wash();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
