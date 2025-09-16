package lesson2;

import java.util.Scanner;

public class L2Task4 {
    public static void main(String[] args) {
        System.out.println("Zehmet olmasa pizza seciminiz yazin: pendirli, pomidorlu, toyuqlu");
        Scanner sc = new Scanner(System.in);
        String pizza = sc.nextLine();
        if (pizza.equals("pendirli")){
            System.out.println("sizin seciminiz:" + pizza);
        }
        else if (pizza.equals("pomidorlu")){
            System.out.println("sizin seciminiz:" + pizza);
        }
        else{
            System.out.println("sizin seciminiz:" + pizza);
        }
    }
}