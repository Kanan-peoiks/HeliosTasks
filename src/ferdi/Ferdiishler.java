package ferdi;

public class Ferdiishler {
    public static void main (String[] args){
        int yas = 10;

        yas = ++yas; //11 olur
        System.out.println(yas);
        yas = yas++; // əvvəlcə köhnə dəyəri qaytarır
        System.out.println(yas);
        yas = --yas;
        System.out.println(yas);
        yas = yas--;
        System.out.println(yas);
    }
}
