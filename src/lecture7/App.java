package lecture7;

import java.security.SecureRandom;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class App {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        String dt = ldt.format(formatter);
        System.out.println(dt);
        String pattern = "'date: 'dd MMMM yyyy HH:mm:ss";
        formatter = DateTimeFormatter.ofPattern(pattern, new Locale("uk"));
        String patLdt = ldt.format(formatter);
        System.out.println(patLdt);

        LocalDateTime pldt = LocalDateTime.parse(patLdt, formatter);
        System.out.println(pldt);

        Shirt shirt = new Shirt("Red shirt", 500, 50);
        System.out.println(shirt);

        B b = new B();
        System.out.println(b.name);
        System.out.println(((A) b).name);

        shirt.wash();
        System.out.println(shirt);
        C c = new C();

        Clothing clothing = new Shirt("Sh", 444, 44);

        Object o = new B();
        System.out.println(o instanceof A);
        System.out.println(o instanceof B);
        System.out.println(o instanceof C);



    }

}

class A {
    String name = "class A";

    public A() {
        System.out.println("constructor A");
    }

}

class B extends A {
    String name = "class B";

    public B() {
        this(5);
        System.out.println("constructor B");
    }

    public B(int i) {
        System.out.println("constructor B (int i)");
    }
}

class C extends B {
    public C() {
        System.out.println("constructor C");
    }
}
