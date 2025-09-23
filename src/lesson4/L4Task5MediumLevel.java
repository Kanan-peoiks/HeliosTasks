package lesson4;

public class L4Task5MediumLevel {
    public static void main(String[] args) {
        float [] massiv = {0,10,20,30,40,50,60};
        float cem =0;
        float ortalama = 0;
        for (int i = 0; i< massiv.length; i++){
            cem += massiv[i];
            ortalama = cem / massiv.length;
        }
        System.out.printf("Ortalama %.2f", ortalama); //printf kimi duzelt
    }
}
