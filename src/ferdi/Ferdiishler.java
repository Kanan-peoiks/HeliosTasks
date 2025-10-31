package ferdi;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Stack;

public class Ferdiishler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String binary = Integer.toBinaryString(n); //binary-a cevirir
        int max_count = 0;
        String [] arr = binary.split("0");

        for (int i = 0; i < arr.length; i++) {
            int length = arr[i].length();
            if (length > max_count){
                max_count = length;
            }
        }
        System.out.println(max_count);


            }
        }

