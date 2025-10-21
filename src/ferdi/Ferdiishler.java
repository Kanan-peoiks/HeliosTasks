package ferdi;

import java.util.Scanner;

public class Ferdiishler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine(); // nextInt-dən sonra qalan newline-i udmaq

        for (int j = 0; j < t; j++) {
            String line = scan.nextLine();
            String[] words = line.split(" "); // hər sözü ayrı-ayrı götür
            StringBuilder result = new StringBuilder();

            for (String word : words) {
                String even = "";
                String odd = "";
                for (int i = 0; i < word.length(); i++) {
                    if (i % 2 == 0) {
                        even += word.charAt(i);
                    } else {
                        odd += word.charAt(i);
                    }
                }
                result.append(even).append(" ").append(odd).append(" ");
            }

            System.out.println(result.toString().trim()); // sonda əlavə boşluq silinir
        }

        scan.close();
    }
}
