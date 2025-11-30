package lesson19.classtask;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        System.out.println(str1 + " " + str2);

        int cevrilmisstr1 = Integer.parseInt(str1);
        int cevrilmisstr2 = Integer.parseInt(str2);

        System.out.println(cevrilmisstr1 + cevrilmisstr2);

        //Bonus
        str1 = Integer.toString(cevrilmisstr1);
        str2 = Integer.toString(cevrilmisstr2);

        System.out.println(str1 +" "+ str2);

    }
}
