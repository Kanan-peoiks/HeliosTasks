package ferdi;

import java.util.LinkedList;
import java.util.Scanner;

class Calculator {
    int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        int result = 1;
        for (int i = 0; i < p; i++) {
            result *= n;
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Calculator cal = new Calculator();
        Scanner scan = new Scanner(System.in);
        int z = scan.nextInt();
        String[] results = new String[z];
        for (int i = 0; i < z; i++) {
            int n = scan.nextInt();
            int p = scan.nextInt();
            try {
                results[i] = String.valueOf(cal.power(n, p));
            } catch (Exception e) {
                results[i] = e.getMessage();
            }
        }
        for (String r : results){
            System.out.println(r);
        }

    }
}

