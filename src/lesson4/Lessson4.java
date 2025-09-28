package lesson4;

public class Lessson4 {
    public static void main(String[] args) {
//        String[] sozler = {"Java", "Programlashdirma", "Dil", "Syntax"};
//        String enUzun = sozler[0];
//        for (String soz : sozler) {
//            if (soz.length() > enUzun.length()) {
//                enUzun = soz;
//            }
//        }
//        System.out.println("En uzun soz: " + enUzun);
//                int[][] arr = {
//                        {10, 20, 66},
//                        {30, 40, 88},
//                        {50, 60, 99}};
//                for (int[] row : arr) {
//                    for (int element : row) {
//                        System.out.print(element + " ");}
//                        System.out.println();}
//        //--------------------------------------------------------------------------------------------
//        // Managing inventory across multiple stores
//// [store][product]
//        int[][] storeInventory = {
//                {100, 150, 200},  // Store 1: Products A, B, C
//                {120, 130, 180},  // Store 2: Products A, B, C
//                {90, 140, 210}    // Store 3: Products A, B, C
//        };
//// Check if any store needs product restocking
//        for (int store = 0; store < storeInventory.length; store++) {
//            for (int product = 0; product < storeInventory[store].length; product++) {
//                if (storeInventory[store][product] < 100) {
//                    System.out.println("Store " + store + " needs to restock product " + product);
//                }
//            }
//        }
//        //--------------------------------------------------------------------------------------------
//// Sorting employee salaries
//        double[] employeeSalaries = {45000.00, 38000.00, 65000.00, 42000.00};
//// Print sorted salaries
//        for (int i = 0; i < employeeSalaries.length; i++) {
//            System.out.println("Salary " + (i + 1) + ": " + employeeSalaries[i]);}
//        //--------------------------------------------------------------------------------------------
//// Copying arrays (e.g., backing up transaction data)
//        int[] transactions = {1001, 1002, 1003};
//        int[] transactionBackup = new int[transactions.length];
//// Manual array copy
//        for (int i = 0; i < transactions.length; i++) {
//            transactionBackup[i] = transactions[i];
//            System.out.println(transactionBackup[i]);}
//        double[] prices = {100, 105, 110, 120, 125, 130, 128, 132, 135, 140};
//        // Son 3 günün ortasını hesablamaq üçün metod çağırırıq
//        double average = calculateAverage(prices, 3);
//        System.out.println("Son 3 günün orta qiyməti: " + average);
//class Solution {
//            public int [] twoSum(int[] nums, int target) {
//                for (int i =0; i< nums.length-1;i++){
//                    for (int j =0; j< nums.length;j++){
//if (nums[i] +nums[j]==target){
//    return new int [ ] {i , j};
//}}}
//                return new int [0];}
//}}
//    // Son N günün orta qiymətini hesablayan metod
//    public static double calculateAverage(double[] stockPrices, int lastNDays) {
//        double sum = 0;
//        int startIndex = stockPrices.length - lastNDays;
//
//        for (int i = startIndex; i < stockPrices.length; i++) {
//            sum += stockPrices[i];}
//         return sum / lastNDays;

        //26.09.2025 PRAKTIKI

//alt+insert
            int [] nums = {1,2,3,1};
        for (int i =0; i< nums.length;i++){
            for (int j =0; j< nums.length;j++){
                if (nums[i]==nums[j]){
                    System.out.println(true);
                }
                else {
                    System.out.println(false);
                }
            }
        }

    }
}

