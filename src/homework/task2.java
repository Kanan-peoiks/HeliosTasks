package homework;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Zehmet olmasa banan siresinin ve kaktus siresinin miqdarini yazin (ml ile): ");
        int banan = sc.nextInt();
        int kaktus = sc.nextInt();
        int result = kaktus + banan;
        System.out.println("Ümumi şirə həcmi: "+ result);
        int stekan = result / 250;
        System.out.println("Vay canına! Bu "+result+" ml kosmik şirə edir! Bu isə "+stekan+" tam stəkan üçün kifayətdir!");
    }
}
