package FundamentalsLecture_7;

import java.util.Objects;

public class Shirt extends Clothing {
    private int size;

    public Shirt(String name, int price, int size) {
        super(name, price);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Shirt shirt = (Shirt) o;
        return size == shirt.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), size);
    }

    @Override
    public void wash() {
        super.wash();
        size--;
    }

    @Override
    public String toString() {
        return "Shirt{" + "name='" + getName() + '\'' + "size='" + getSize() + '\'' + ", price=" + getPrice() + '}';
    }
}
