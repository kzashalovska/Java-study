package FundamentalsLecture_6;

public class App1 {
    public static void main(String[] args) {
        String name1 = "Vasya";
        String name2 = "Vasya";
        String name3 = new String("Vasya");
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        String s = "mama mila ramu";
        System.out.println(s.charAt(2));
        System.out.println(s.indexOf("a"));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.lastIndexOf('a', 10));
        System.out.println(s.indexOf("mil"));
        System.out.println(s.indexOf("f"));
        findSymbolIndex(s, 'a');
        s.substring(4, 8);
        System.out.println(s);
        System.out.println(s.replace('m', 'p'));
        StringBuilder sb = new StringBuilder();
        System.out.println("sb.length = " + sb.length());
        System.out.println("sb.capacity = " + sb.capacity());
        for (int i = 0; i < 100; i++) {
            sb.append(i).append(" ");
            System.out.println("sb.length = " + sb.length());
            System.out.println("sb.capacity = " + sb.capacity());
        }
        sb.trimToSize();
        System.out.println("sb.length = " + sb.length());
        System.out.println("sb.capacity = " + sb.capacity());

    }

    public static void findSymbolIndex(String s, char a) {
        int index = 0;
        while ((index = s.indexOf(a, index)) != -1) {
            System.out.println(index++);
        }
    }
}
