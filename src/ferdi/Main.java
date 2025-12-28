package ferdi;

import java.util.LinkedList;
import java.util.Scanner;


interface AdvancedArithmetic {
    int divisorSum(int n);
    //İnterface məntiqi budur ki, bu yuxarıda yazdığımız metodu mütləq çağırmalısan deyir
}

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}


public class Main {
    public static void main(String[] args){
    Calculator cal = new Calculator();
    Scanner scan= new Scanner(System.in);
    int n = scan.nextInt();
    int result = cal.divisorSum(n);
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(result);
    scan.close();

    }
}

