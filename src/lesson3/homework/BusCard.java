package lesson3.homework;

import java.util.Scanner;

public class BusCard {
    public static void main(String[] args) {

        double balans = 1;
        double gedishaqqi = 0.7;
        String yeniden = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Balansınız: "+ balans+" AZN");
        do {
            System.out.println("Avtobusa minirsiniz...");
            if (balans >= gedishaqqi) {
                balans = balans - gedishaqqi;
                System.out.printf("✅ Gediş haqqı ödənildi! Yeni balans: %.2f AZN%n", balans);
                //System.out.println("✅ Gediş haqqı ödənildi! Yeni balans: "+balans); BELƏ OLANDA VERGÜLDƏN SONRA ÇOX ƏDƏD YAZIR


            } else {
                System.out.printf("❌ Balans kifayət etmir! %.2f AZN%n", balans);
                while (balans < gedishaqqi) {
                    System.out.println("Balans artırmaq istədiyiniz məbləği daxil edin: ");
                    int yenibalans = sc.nextInt();
                    sc.nextLine();
                    balans = balans + yenibalans;
                    System.out.printf("✅ Yeni balans: %.2f AZN%n", balans);

                }
                System.out.println("Avtobusa minirsiniz...");
                balans = balans - gedishaqqi;
                System.out.printf("✅ Gediş haqqı ödənildi! Yeni balans: %.2f AZN%n", balans);
            }
            System.out.println("Yenidən vurmaq istəyirsiz? Hə və ya yox: ");
            yeniden = sc.nextLine();
            if (!yeniden.equalsIgnoreCase("hə") && !yeniden.equalsIgnoreCase("yox")) {
                System.out.println("⚠️ Yalnış cavab! Yalnız 'hə' və ya 'yox' yazın.");
                yeniden = "hə"; // səhv cavab olsa, dövr davam etsin, CƏZALANDIRMAQ
            }
        }
        while(yeniden.trim().equalsIgnoreCase("hə"));
        System.out.println("Təşəkkürlər!");
        sc.close();
    }
}
