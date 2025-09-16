package lesson2;

import java.util.Scanner;

public class L2Task5 {
    public static void main(String[] args) {
        System.out.println("Zehmet olmasa saati yazin:");
        Scanner sc = new Scanner(System.in);
        int saat = sc.nextInt();
        if (saat>=6 && saat<=11){
            System.out.println("Sabahınız xeyir!");
        }
        else if (saat>=12 && saat<=17){
            System.out.println(" gunortaniz xeyir!");
        }
        else if (saat>=18 && saat<=22){
            System.out.println("axsaminiz xeyir!");
        }
        else {
            System.out.println("Gecəniz xeyir!");
        }
    }
}
