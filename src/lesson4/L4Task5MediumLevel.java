package lesson4;

public class L4Task5MediumLevel {
    public static void main(String[] args) {
        int [] massiv = {0,10,20,30,40,50,60};
        int cem =0;
        int ortalama = 0;
        for (int i = 0; i< massiv.length; i++){
            cem += massiv[i];
            ortalama = cem / massiv.length;
        }
        System.out.println(ortalama); //printf kimi duzelt
    }
}
