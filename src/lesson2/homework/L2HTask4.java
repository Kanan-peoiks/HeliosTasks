package lesson2.homework;

import java.util.Scanner;

public class L2HTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Paylaşımın mətn uzunluğunu daxil edin: ");
        int uzunluq = sc.nextInt();
        System.out.println("Şəkil var? true vəya false");
        boolean shekil = sc.nextBoolean();
        System.out.println("Bəyənilmə sayını daxil edin: ");
        int beyenilme = sc.nextInt();

        if (uzunluq > 100 || beyenilme >500){
            System.out.println("Populyar paylaşımdır.");
        }
            else if (shekil|| uzunluq>50){
            System.out.println("Maraqlı paylaşımdır.");}
                else {
            System.out.println("Standart paylaşımdır.");
        }
    }
}
