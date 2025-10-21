package lesson5;

import java.util.Scanner;

public class L4MultiArrayTask5 {
    public static void main(String[] args) {

        String[][] numbers = {
                {"salam", "sagol"},
                {"deli", "veli"}
        };

        Scanner scan = new Scanner(System.in);
        String ad = scan.nextLine();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (ad.equals(numbers[i][j])){
                    System.out.println("tapdiniz");
                }
                //else yazma yoxsa her tapilmayanda tapilmadi deye mesajlar gonderecek
            }

        }
    }
}
