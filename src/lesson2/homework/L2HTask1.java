package lesson2.homework;

import java.util.Scanner;
public class L2HTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zehmet olmasa kitab ve defterin qiymetini yazin: ");
        int qiymet1 = sc.nextInt();
        int qiymet2 = sc.nextInt();
        int result = qiymet2 + qiymet1;
        if (result > 50) {
            System.out.println("Umumi mebleg: " + result);
            System.out.println("50 AZN-dən çox alış-verişə görə pulsuz çatdırılma!");
        }
        else {
            System.out.println("Umumi mebleg: " + result);
        }
    }
}
