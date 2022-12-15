package FundamentalsLecture_5;

public class Boss {
    private static Boss instance;

    private String name;

    public Boss(String name) {
        this.name = name;
    }

    public static Boss getInstance(String name) {
        if (instance == null) {
            instance = new Boss(name);
        } else {
            instance.setName(name);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
