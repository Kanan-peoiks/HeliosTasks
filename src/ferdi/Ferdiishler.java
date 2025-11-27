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
    int q = scan.nextInt();

        for (int i = 0; i < q; i++) {

            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int res = a;


            for (int j = 1; j <= n; j++) {
                res = res + b;
                b = b * 2;
                System.out.printf(res+" ");
            }
            System.out.println();
        }
// 5+1*3 b=3 5+2*3 b6 5+3*6 b18 5+4*18 b72 5+5*72           8,11,21,77,365 -> 8/14/26/50/98






    }
}
