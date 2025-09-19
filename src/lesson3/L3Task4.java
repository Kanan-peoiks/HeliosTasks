package lesson3;

import java.util.Random;

public class L3Task4 {
    public static void main(String[] args) {
        Random rn = new Random();

        for (int i = 1; i < 10; i++) {
            int ranum = rn.nextInt(1,100);
            System.out.println(ranum);
        }
    }
}
