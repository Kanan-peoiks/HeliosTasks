package ferdi;
import java.sql.Array;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;


    //SUBSTRING COMPARETO CHARACTER..
    //He is a very very good boy, isn't he?

public class Ferdiishler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            String s = scan.nextLine();
            long num = Long.parseLong(s);

        if (num >= -128 && num <= 127) {
            System.out.println("* byte");
        }
        if (num >= -32768 && num <= 32767) {
            System.out.println("* short");
        }
        if (num >= -2147483648L && num <= 2147483647L) {
            System.out.println("* int");
        }
        if (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE) {
            System.out.println("* long");
        }



        }


    }
}
