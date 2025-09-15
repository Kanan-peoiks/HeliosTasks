package lesson1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Tasklar

        Scanner sc = new Scanner(System.in);
        System.out.println("dondurmanin qiymetini daxil edin : ");
        double dondurmaQiymeti1 = sc.nextDouble();
        double dondurmaQiymeti2 = sc.nextDouble();
        double sum = dondurmaQiymeti1 + dondurmaQiymeti2;
        double result = dondurmaQiymeti1 * dondurmaQiymeti2;
        double qaliq = dondurmaQiymeti1 % dondurmaQiymeti2;
        System.out.println("İki dondurma topunun ümumi qiyməti : " + sum);
        System.out.println("İki dondurma topunun hasili : " + result);
        System.out.println("Birinci qiymətin ikinciyə bölünməsindən qalanı : " + qaliq);

    }
}
