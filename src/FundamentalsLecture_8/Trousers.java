package FundamentalsLecture_8;

public class Trousers extends Clothing {
    public Trousers(String name, int price) {
        super(name, price);
    }

    @Override
    public void wash() {
        System.out.println("Trousers is clean");
    }

    @Override
    public String howToClean() {
        return "50 degree";
    }
}
