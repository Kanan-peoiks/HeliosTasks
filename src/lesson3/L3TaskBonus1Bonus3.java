package lesson3;

import java.util.Random;
import java.util.Scanner;

public class L3TaskBonus1Bonus3 {
    public static void main(String[] args) {
        int count=3;
        Random rn = new Random();
        int ranum = rn.nextInt(1,10);

        while (count>0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("eded daxil edin.");
            int eded= sc.nextInt();
            if (eded == ranum){
                System.out.println("Təbriklər!");
                break;
            }
            else {
                System.out.println("Yanlis cavab.");
            }
            count--;
        }
        if  (count==0){
            System.out.println("Uduzdunuz!");
        }
    }
}
