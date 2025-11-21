package lesson18.classtask.string;

public class Task5 {
    public static void main(String[] args) {
        String sebet = "alma, banan ,kivi,   portağal ,nar, heyva  ,  armud";

    String [] mehsullar;
        int mehsulCount = 0;
        mehsullar = sebet.replace(" ", "").split(",");

        for (int i = 0; i < mehsullar.length; i++) {
            System.out.println(mehsullar[i]);
            mehsulCount++;
        }
        System.out.println(mehsulCount);
    }
}
