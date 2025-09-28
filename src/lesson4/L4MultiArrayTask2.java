package lesson4;

import java.util.Scanner;

public class L4MultiArrayTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] numbers = {
                {1, 2},
                {4, 3}
        };
        int cem = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                cem += numbers[i][j];
            }
        }
        System.out.println(cem);
    }
}
