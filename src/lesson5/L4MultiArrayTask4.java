package lesson5;

public class L4MultiArrayTask4 {
    public static void main(String[] args) {

        int[][] numbers = {
                {1, 2},
                {4, 3}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                System.out.print(numbers[i][j]);
                }
            System.out.println();

        }

    }
}
