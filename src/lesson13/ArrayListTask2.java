package lesson13;

import java.util.ArrayList;

public class ArrayListTask2 {
    public static void main(String[] args) {
        ArrayList<String> restoranYemekleri  = new ArrayList<>();
        restoranYemekleri.add("DOLMA");
        restoranYemekleri.add("Kartof");
        restoranYemekleri.add("Plov");
        System.out.println(restoranYemekleri.size());
        restoranYemekleri.add("Qarabasaq");
        System.out.println(restoranYemekleri.size());
    }
}
