package ferdi;
import java.sql.Array;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Ferdiishler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        String B = scan.nextLine();

        int res = A.length() + B.length();
        System.out.println(res);
        int res2 = A.compareTo(B);
        if ( res2> 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        char Ab = A.charAt(0);
        char ab = Character.toUpperCase(Ab);

        char Ba = B.charAt(0);
        char ba = Character.toUpperCase(Ba);

        System.out.println(ab + A.substring(1) + " " +ba + B.substring(1) );












    }
}
