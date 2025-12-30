package ferdi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static <T> void printArray(T [] array){
        for(T element: array){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        scan.nextLine();
        String[] stringArray = new String[m]; // m = element sayı
        for (int i = 0; i < m; i++) {
            stringArray[i] = scan.nextLine();
        }
        printArray(intArray);
        printArray(stringArray);
scan.close();

    }
}


