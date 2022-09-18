package lecture3;

public class TrueFalse {

    public static String name;

    public static void main (String [] args){
        System.out.println((3<4)&&(5>1));
        System.out.println(method1(true) & method2(false));
        if (name != null && name.length() > 2)

        {
            System.out.println("name = " + name);
        }
        else{
            System.out.println("Wrong name!");
        }
        System.out.println("true ^ true = " + (true ^ true));

        int x = 3736;
        int y = 3532;
        System.out.println("x = " + Integer.toBinaryString(x));
        System.out.println("y = " + Integer.toBinaryString(y));
        System.out.println("x&y=" + Integer.toBinaryString(x&y));
        System.out.println("x|y=" + Integer.toBinaryString(x|y));
        System.out.println("x^y=" + Integer.toBinaryString(x^y));

        String s = "00111001";
        int i = Integer.parseInt(s, 2);
        System.out.println(i);

        for (int j = 0; j < 8; j++) {
            if ((i & (int)Math.pow(2, j)) != 0)
            System.out.println("Сработал: " +  j + " датчик");
        }
        System.out.println("x = " + Integer.toBinaryString(x));
        System.out.println("x>>2 " + Integer.toBinaryString(x>>2));

        System.out.println((name != null && name.length() > 2)? name : "Wrong name");

        for (i = 0; i < 10; i++){
            System.out.println(i);

        }

        m:for (i = 0; i < 5; i++){
            for (int j = 0; j < 7; j++){
                if (j == 3) continue m;
                System.out.print("m" +i+j + " ");
            }
            System.out.println();
        }
    }

    private static boolean method1(boolean b) {
        System.out.println("method1(" + b + ")");
        return false;
    }
    private static boolean method2(boolean b) {
        System.out.println("method2(" + b + ")");
        return false;
    }

}
