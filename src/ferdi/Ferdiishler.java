package ferdi;

import java.util.Scanner;

public class Ferdiishler {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }

        if (s.isEmpty()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
