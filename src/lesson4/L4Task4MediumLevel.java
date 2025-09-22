package lesson4;

public class L4Task4MediumLevel {
    public static void main(String[] args) {
        int [] massiv = {167283,2125,373,40886,51, 234224422};
        int max = massiv[0];
        int min = massiv[0];
        for (int i = 0; i < massiv.length; i++) {
            if (max < massiv[i]) max = massiv[i];
            if (min > massiv[i]) min = massiv[i];
        }
        System.out.println("MAX: "+ max +" MIN: "+ min);
    }
}
