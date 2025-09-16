package lesson2;

import java.util.Scanner;

public class L2Task6 {
    public static void main(String[] args) {
        System.out.println("Zehmet olmasa imtahan balini yazin:");
        Scanner sc = new Scanner(System.in);
        int bal = sc.nextInt();
        if (bal>=90 && bal<=100){
            System.out.println("A");
        }
        else if (bal>=80 && bal<=89){
            System.out.println("b");
        }
        else if (bal>=70 && bal<=79){
            System.out.println("c");
        }
        else if (bal>=60 && bal<=69){
            System.out.println("c");
        }

        else {
            System.out.println("f");
        }
    }
}
