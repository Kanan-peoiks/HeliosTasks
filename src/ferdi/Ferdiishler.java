package ferdi;
import java.sql.Array;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;


    //SUBSTRING COMPARETO CHARACTER..

public class Ferdiishler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int k = scan.nextInt();
        // banana - > ban ana nan ana
    int sum = s.length() - k + 1 ;

        String [] arr = new String[sum];
        for (int i = 0; i < sum; i++) {
            arr[i] = s.substring(i,i+k);
        }

        String min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(min) < 0) {
                min = arr[i];
            }
        }
        String max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].compareTo(max)>0){
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);











    }
}
