package lecture8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static List<String> strings = new ArrayList<>();

    public static void main(String[] args) {

        Clothing clothing = new Shirt("My shirt", 2500, 50);
        System.out.println(clothing);

        clothing.wash();


        strings.add("1");
        strings.add("2");
        strings.add("3");
        System.out.println(strings);

        Loundry loundry = new Loundry();
        loundry.clean(clothing);

        Clothing[] clothings = {
                new Shirt("Shirt 1", 300, 40),
                new Trousers("Trousers1", 500),
                new Shirt("Shirt 2", 200, 50),
                new Trousers("Trousers2", 100),
                new Shirt("Shirt 3", 600, 45),
                new Trousers("Trousers3", 700),
                new Shirt("Shirt 4", 550, 65),
                new Trousers("Trousers4", 200)
        };
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Clothing clothing1 : clothings) {
            System.out.println(clothing1);
        }
        Arrays.sort(clothings);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Clothing clothing1 : clothings) {
            System.out.println(clothing1);
        }
        Arrays.sort(clothings, (a,b)->b.getName().compareTo(a.getName()));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Arrays.asList(clothings).forEach(System.out::println);

        for (Clothing clothing1 : clothings) {
            clothing1.wash();
        }
    }
}
