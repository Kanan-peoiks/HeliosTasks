package ferdi;

import java.util.Scanner;

public class ferdi {
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
