package lesson4;
import java.util.Arrays;

public class L4Task3 {
    public static void main(String[] args) {
        int [] massiv = {167283,2125,373,40886,51};
        Arrays.sort(massiv);
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        }
    }
}
