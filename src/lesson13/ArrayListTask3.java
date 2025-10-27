package lesson13;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask3 {
    public static void main(String[] args) {
        ArrayList<String> kitablar = new ArrayList<>();
        kitablar.add("10 Zence Balasi");
        kitablar.add("Bozkurtlar");
        kitablar.add("Dinle, kucuk adam");
        Scanner scan = new Scanner(System.in);

        System.out.println("Kitab adini daxil et: ");
        String axtaris = scan.nextLine();

        for (int i = 0; i < kitablar.size(); i++) {
            if (kitablar.contains(axtaris)){
                System.out.println("Kitab tapıldı");
            }
            else {
                System.out.println("Kitab mövcud deyil");
            }
        }

    }
}
