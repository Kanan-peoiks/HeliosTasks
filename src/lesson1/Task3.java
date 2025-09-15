package lesson1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("gunde nece fincan qehve icilir : ");
        int icilenQehve = sc.nextInt();
        System.out.println("bir fincan neceyedir: ");
        double qehveQiymeti = sc.nextDouble();
        double ayliqQehveXerci = qehveQiymeti * icilenQehve *30;

        System.out.println("Aylıq ümumi xərci: " + ayliqQehveXerci);
        double isciBasinaDusenFincan= icilenQehve*30/5;

        System.out.println("5 işçi varsa, hər işçiyə düşən fincan sayı " + isciBasinaDusenFincan);


    }
}
