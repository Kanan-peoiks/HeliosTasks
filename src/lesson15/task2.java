package lesson15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        String ad;
        String parol;

        // İstifadəçiləri əlavə etmək
        for (int i = 0; i < 5; i++) {
            System.out.println("ad daxil et");
            ad = scan.nextLine();

            System.out.println("parol daxil et");
            parol = scan.nextLine();

            map.put(ad, parol);
        }

        // Bütün istifadəçiləri göstərmək
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Giriş yoxlanışı üçün yeni ad və parol istənilir
        System.out.println("Giriş üçün ad daxil et:");
        String girisAd = scan.nextLine();

        System.out.println("Giriş üçün parol daxil et:");
        String girisParol = scan.nextLine();

        // Girişi yoxlama
        if (map.containsKey(girisAd) && map.get(girisAd).equals(girisParol)) {
            System.out.println("✅ Giriş uğurludur! Xoş gəldiniz, " + girisAd + "!");
        } else {
            System.out.println("❌ Yanlış istifadəçi adı və ya parol!");
        }

        scan.close();
    }
}
