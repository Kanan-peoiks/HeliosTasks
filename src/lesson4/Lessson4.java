package lesson4;

public class Lessson4 {
    public static void main(String[] args) {
        String[] sozler = {"Java", "Programlashdirma", "Dil", "Syntax"};

        String enUzun = sozler[0];

        for (String soz : sozler) {
            if (soz.length() > enUzun.length()) {
                enUzun = soz;
            }
        }

        System.out.println("En uzun soz: " + enUzun);


                int[][] arr = {
                        {10, 20, 66},
                        {30, 40, 88},
                        {50, 60, 99}
                };

                for (int[] row : arr) {
                    for (int element : row) {
                        System.out.print(element + " ");
                    }
                    System.out.println();
                }
            }
        }
