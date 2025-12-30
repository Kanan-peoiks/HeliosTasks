package ferdi;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            int k = scan.nextInt();
            if (k <= 1) {
                arr[i] = "Not prime";
            } else {
                boolean isPrime = true;
                for (int j = 2; j * j <= k; j++) {
                    if (k % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    arr[i] = "Prime";
                } else {
                    arr[i] = "Not prime";
                }
            }

        }

        for (String arr1 : arr){
            System.out.println(arr1);
        }






    }
}


