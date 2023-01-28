package org.example.lectures.lecture3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        String s = "23";
        int i = Integer.parseInt(s, 16);
        System.out.println(i);
        int a = 5;
        String s1 = s+a;
        System.out.println(s1);
        String s2 = String.valueOf(a);
        System.out.println(s2);
        String s3 = "mama";
        String s4 = "papa";
        System.out.println(s3.compareTo(s4));
        System.out.println((int)'m');
        System.out.println((int)'p');

        System.out.println(s3.regionMatches(1, s4, 1, 1));
        String s5 = "mama, mila-, ramu";
        System.out.println(s5.indexOf('a',3));

        StringTokenizer st = new StringTokenizer(s5, ", -");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        String s6 = "2.3 , 34 , 3.4 , 4, 5.6";
        Scanner scanner = new Scanner(s6).useDelimiter("[, ]+").useLocale(Locale.ENGLISH);
        while (scanner.hasNextFloat()){
            System.out.println(scanner.nextDouble() + 1);
        }
        String[]strings= s6.split("[, ]+");
        System.out.println(Arrays.toString(strings));

        String html = "<html>\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\">\n" +
                "    <title>Моя тестовая страница</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <p>Это — моя страница</p>\n" +
                "  </body>\n" +
                "</html>";
        Pattern pattern = Pattern.compile("<.+?>");
        Matcher matcher = pattern.matcher(html);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        String index = "Canadys 29433 Cottageville 29435123545 yevdokimov-denis1@gmail.com Edisto Island 29438 Green Pond " +
                "29446 Islandton 29929 Jacksonboro 29452 Lodge 0500116689 29082 gurino@mail.com Round 0999537357 O 29474 Ruffin 29475 Smoaks 29481" +
                "Walterboro 29488 Williams 29493";
        pattern = Pattern.compile("\\D(?<group>\\d{5})");
        matcher = pattern.matcher(index);
        while (matcher.find()){
            System.out.println(matcher.group("group"));
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // not found email yevdokimov.
        pattern = Pattern.compile("[\\w-]+@\\w+\\.\\w+");
        matcher = pattern.matcher(index);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        pattern = Pattern.compile("(\\D)(\\d{3})(\\d{3})(\\d{2})(\\d{2})(\\D)");
        matcher = pattern.matcher(index);
        System.out.println(matcher.replaceAll("$1($2) $3-$4-$5$6"));

        String s7 = "Вы купили %1$s за %2$.2f %4$s, итого %3$.2f %4$s\n";
        System.out.printf(s7, "рубашку", 398.3, 789., "грн");

        String s8 = String.format(s7, "рубашку", 398.3, 789., "грн");
        System.out.println(s8);
    }
}
