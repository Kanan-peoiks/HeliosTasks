package lesson5;

import java.util.Arrays;

public class L4MultiArrayTask6 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 57},
                {4, 3, 23}
        };

        for (int i = 0; i < numbers.length; i++) {
            Arrays.sort(numbers[i]);

            for (int j = 0; j < numbers[i].length ; j++) {
                System.out.print(" ");
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
//        int [] num = {3435,23,35345,12};
//        Arrays.sort(num);
//        System.out.print("");
//        for (int n : num)
//        { System.out.print(n + " "); } //VEYA
//        //----------------------
//        System.out.println();
//        int [] nums = {3435, 23, 35345, 12};
//        Arrays.sort(nums);
//        for (int i = 0; i < num.length; i++) {
//            System.out.print(nums[i]+" "); // səhv
//        }
    }
}
