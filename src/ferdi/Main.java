package ferdi;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        try{
        int n = Integer.parseInt(s);
            System.out.println(n);
        } catch (Exception e) {
            System.out.println("Bad String");
        }





    }
}

