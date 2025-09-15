package lesson1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("İstifadəçidən 3 məhsulun qiyməti : ");
        int mehsul1 = sc.nextInt();
        int mehsul2 = sc.nextInt();
        int mehsul3 = sc.nextInt();
        int sum = mehsul1+mehsul2+mehsul3;
        System.out.println("Bütün qiymətlərin cəmi: " + sum);
        int ortaQiymet= sum/3;
        System.out.println("Qiymətlərin orta qiyməti : " + ortaQiymet);
        int hasil = mehsul1*mehsul2*mehsul3;
        System.out.println("Qiymətlərin hasili: " + hasil);
    }
}