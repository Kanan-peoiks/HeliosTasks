package lesson2.homework.coffeeShop;

import java.util.Scanner;

public class CoffeeShopApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yaşınızı daxil edin: ");
        int age = sc.nextInt();
        sc.nextLine(); //QAYDA OLARAQ BELEDI
        double odenis; //double odenis = 0;
        System.out.println("Menyu: Latte, Mokaçino, Kapuçino, Espresso, Amerikano ");
        String secim = sc.nextLine();
        secim = secim.trim().toLowerCase();
        switch (secim){
            case "latte":
                System.out.println("Qiymet: 12 Azn");
                odenis = 12;
                break;
            case "mokaçino":
                System.out.println("Qiymet: 15 Azn");
                odenis=15;
                break;
            case "kapuçino":
                System.out.println("Qiymet: 10 Azn");
                odenis=10;
                break;
            case "espresso":
                System.out.println("Qiymet: 17 Azn");
                odenis=17;
                break;
            case "amerikano":
                System.out.println("Qiymet: 18 Azn");
                odenis=18;
                break;
            default:
                System.out.println("Yanlış seçim");
                return; //odenisi hesablamasın deye
        }
        if ( age < 12) {
            System.out.println("Icki pulsuzdur. ;)");
            odenis = 0;
        }
        else if ( age >= 65){
            System.out.println("Size 3% endirim tetbiq olunacaq. ^-^");
            odenis = odenis - (odenis *3 / 100);
        }
        else if (age >12 && age <18){
            System.out.println("Size telebe endirimi tetbiq olunacaq. :)");
            odenis = odenis - (odenis *5 / 100);
        }
        else {
            System.out.println("Size hec bir endirim tetbiq olunmayacaq. -_-");
        }
        System.out.println("Yekun mebleg: "+odenis);
    }
}
