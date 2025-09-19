package lesson3;

import java.util.Scanner;

public class L3TaskBonus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("soz daxil edin.");
        String soz= sc.nextLine();
        char tapilmali = 'a';
        int count=0;
         for (int i = 0; i <soz.length();i++){
             if (soz.charAt(i)==tapilmali){
                 count++;
             }
         }
        System.out.println(count);
    }
}
