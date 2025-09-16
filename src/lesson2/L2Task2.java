package lesson2;

import java.util.Scanner;

public class L2Task2 {
    public static void main(String[] args) {
        System.out.println("Zehmet olmasa seciminizi daxil edin: 1-BATMAN, 2-SELENA, 3-HOMELANDER ");
        Scanner sc = new Scanner(System.in);
        int secim = sc.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Batmani secdiniz");
                break;
            case 2:
                System.out.println("Selenani secdiniz");
                break;
            case 3:
                System.out.println("Homelander-i secdiniz");
                break;
            default:
                System.out.println("Bele secim yoxdur");

        }
    }
}
