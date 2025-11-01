package ferdi;
import java.sql.Array;
import java.util.Scanner;
import java.util.Stack;

public class Ferdiishler {
    public static void main(String[] args) {
        int max;
        int sum = 0;
        max = sum;
        int[][] arr = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 9, 2, -4, -4, 0},
                {0, 0, 0, -2, 0, 0},
                {0, 0, -1, -2, -4, 0}
        };


        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {

                int a = arr[i][j];
                int b = arr[i][j + 1];
                int c = arr[i][j + 2];
                int d = arr[i + 1][j + 1];
                int e = arr[i + 2][j];
                int f = arr[i + 2][j + 1];
                int g = arr[i + 2][j + 2];

                sum = a + b + c + d + e + f + g;

                if (max < sum){
                    max =sum;
                }

            }


        }
        System.out.println(max);
    }
}

