package lesson2;

import java.util.Scanner;

public class L2Task1 {
    public static void main(String[] args) {
        System.out.println("Zehmet olmasa yasiniz daxil edin: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if ( age >=18){
            System.out.println("girise icaze var");
        }
        else {
            System.out.println("giris qadagandir.");
        }

    }
}
