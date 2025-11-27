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
        String s = scan.nextLine().trim();

        String[] arr = new String [s.length()];

        arr = s.split("[ !,?._'@]+");
        int count=0; //bunu da split etmek olar

        for (int i = 0; i < arr.length; i++) {
            count++;
        }

        System.out.println(count);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }











    }
}
