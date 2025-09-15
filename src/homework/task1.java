package homework;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zehmet olmasa adinizi yazin: ");
String ad = sc.nextLine();
        System.out.println("Zehmet olmasa yasinizi yazin: ");
int yas = sc.nextInt();
        System.out.println("Zehmet olmasa boyunuzu yazin: ");
double boy = sc.nextDouble();
        System.out.println("Salam, " +ad+ "! Yasiniz "+ yas +" ve boyunuz "+boy+" metrdir.");
    }
}
