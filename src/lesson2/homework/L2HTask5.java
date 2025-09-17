package lesson2.homework;

import java.util.Scanner;

public class L2HTask5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Film növünü daxil edin (Action, Comedy, Drama, Animation): ");
        String film = sc.nextLine();
        film = film.trim().toLowerCase();
        int cem;
    switch (film){
        case "action", "drama":
            System.out.println("12 AZN");
            cem = 12;
            break;
        case "comedy":
                System.out.println("10 AZN.");
                cem= 10;
                break;
        case "animation":
                System.out.println("8 AZN");
                cem=8;
                break;
        default:
            System.out.println("10 AZN");
            cem = 10;
            break;
    }
        System.out.println("Həftənin gününü daxil edin (Bazar, Şənbə): ");
        String hefte = sc.nextLine();
        if (hefte.equalsIgnoreCase("Şənbə") || hefte.equalsIgnoreCase("Bazar")) {
        cem=cem+2;
            System.out.println("2 AZN əlavə");}
        else {
            System.out.println("əlavə qiymət artımı yoxdur");
        }

        System.out.println("Yaş kateqoriyasını daxil edin (Uşaq, Yetkin, Tələbə):");
        String yash = sc.nextLine();
        yash = yash.trim().toLowerCase();
        switch (yash){
            case "uşaq":
                System.out.println("2 AZN endirim");
                cem = cem-2;
                break;
            case "tələbə":
                System.out.println("1 AZN endirim");
                cem= cem -1;
                break;
            case "yetkin":
                System.out.println("endirim yoxdur!!!");
                break;
            default:
                System.out.println("Yeniden yoxlayın");
                break;
        }

        System.out.println("Son bilet qiyməti: "+cem);
    }
}
