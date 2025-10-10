package lesson8.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Zehmet olmasa 6 simvoldan ibaret kod daxil edin. ");
        String parol =scan.nextLine();

        try {
           if (parol.length() <6){
throw new InvalidPasswordException("6 simvoldan ibaret kod daxil edin.");
           }
            System.out.println("Parol qəbul edildi ✅");
        }
        catch (InvalidPasswordException e){
            System.out.println("Xeta: "+ e.getMessage());
        }
        scan.close();
    }
}
