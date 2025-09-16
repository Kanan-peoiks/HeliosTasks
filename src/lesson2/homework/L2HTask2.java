package lesson2.homework;

import java.util.Scanner;

public class L2HTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zehmet olmasa yasinizi yazin: ");
        int yas = sc.nextInt();
        if (yas >=18){
            System.out.println("Normal bilet qiyməti: 1.00 AZN");
        }
        else {
            System.out.println("Uşaq bileti qiyməti: 0.50 AZN");
        }
    }
}
