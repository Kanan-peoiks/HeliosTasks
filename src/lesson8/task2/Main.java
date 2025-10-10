package lesson8.task2;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("zehmet olmasa eded daxil edin");
        String a=scan.nextLine();
        try{

            int input = Integer.parseInt(a);

            if (input%2==0){
                System.out.println("Even");
                throw new NumberFormatException("hmfnhgngf");

            }
            else {
                System.out.println("Odd");

            }

        } catch (NumberFormatException e){
            System.out.println("Xeta: "+ e.getMessage());
        }

       scan.close();
    }
}
