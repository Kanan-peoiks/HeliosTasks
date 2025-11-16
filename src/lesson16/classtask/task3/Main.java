package lesson16.classtask.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Knife knife = new Knife();
    Scanner scan = new Scanner(System.in);
    Cook [ ] cooks = new Cook[3];
        System.out.println("adlari daxil et: ");
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + ". ad: ");
            String name1 = scan.nextLine();

            String name = "Thread-" + (i + 1);
            cooks[i] = new Cook(name, name1, knife);
        }

        for (int i = 0; i < cooks.length; i++) {
            cooks[i].start();
        }


        for (int i = 0; i < cooks.length; i++) {
            try {
                cooks[i].join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Bütün yeməklər hazırdır!");

    }
}
