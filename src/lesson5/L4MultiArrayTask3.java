package lesson5;

public class L4MultiArrayTask3 {
    public static void main(String[] args) {

        int[][] numbers = {
                {1, 2},
                {4, 3}
        };
        int max = numbers[0][0];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
            if (max < numbers[i][j]) max = numbers[i][j];}
        }
        System.out.println(max);
    }
}
