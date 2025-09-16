package lesson2.homework;

import java.util.Scanner;

public class L2HTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zehmet olmasa almaq istediyiniz mehsulun adini yazin. Süd (2.5), çörek(0.5), pendir(5) ");
        String mehsul = sc.nextLine();
        System.out.println("Nece eded alacaqsiniz: ");
        double eded = sc.nextDouble();
double result = 0;
double endirim = 0;
        if (mehsul.trim().equalsIgnoreCase("sud")){
            result = eded * 2.5;
            System.out.println("İlkin məbləğ: "+result);}

            else if (mehsul.trim().equalsIgnoreCase("Corek")){
            result = eded * 0.5;
            System.out.println("İlkin məbləğ: "+result);}

                else if (mehsul.trim().equalsIgnoreCase("Pendir")){
            result = eded * 5;
            System.out.println("İlkin məbləğ: "+result);}

                    else{System.out.println("Bele mehsul yoxdur");
                        return;
        }
        if (result >=10){
            endirim = result/20;
            System.out.println("Tətbiq olunan endirim: 5% "+endirim);


        }
        else if (result >5){
            endirim = result/50;
            System.out.println("Tətbiq olunan endirim: 2% "+endirim);
        }
        else {
            System.out.println("təəssüf ki, endirim yoxdur.");
        }
        result= result-endirim;
        System.out.println("Son məbləğ: "+result);
    }
}
