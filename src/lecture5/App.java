package lecture5;

public class App {
    public static void main(String[] args) {
        Myclass myclass1 = new Myclass();
        System.out.println("~~~~~~~~~~~~~~~~~~");
        Myclass myclass2 = new Myclass();
        System.out.println("~~~~~~~~~~~~~~~~~~");
        Myclass myclass3 = new Myclass();
    }
}
    class Myclass {
        static {
            System.out.println("Static init block");
        }
        public Field field1 = new Field("field1");
        public static Field staticField1 = new Field("staticField 1");

        public Myclass() {
            System.out.println("Constructor");
        }

        {
            System.out.println("Init block");
        }



        public Field field2 = new Field("field2");
        public static Field staticField2 = new Field("staticField 2");
    }
    class Field{
        public Field(String s){
            System.out.println(s);
        }
    }


