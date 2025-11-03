package ferdi;
import java.sql.Array;
import java.util.Scanner;
import java.util.Stack;

public class Ferdiishler {
    public static void main(String[] args) {
        String s;
        Scanner scan = new Scanner(System.in);
        s = scan.nextLine();

        s = s.toLowerCase();

        String clean = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                clean += c;
            }
        }

        String reversed = "";
        for (int i = clean.length() - 1; i >= 0; i--) {
            reversed += clean.charAt(i);
        }
        if (s.equals(reversed)) {
            System.out.println("The word," + reversed + ", is a palindrome.");
        }
        else {
            System.out.println("The word," + s + ", is not a palindrome.");
        }
    }
}
