package lesson13;

import java.util.LinkedList;

public class LinkedListTask3 {
    public static void main(String[] args) {
        LinkedList<String> seherler = new LinkedList<>();

        seherler.add("SUMQAYIT");
        seherler.add("baki");
        seherler.add("gence");
        seherler.add("Xirdalan");
        System.out.println(seherler);

        seherler.remove(3);
        seherler.add(2,"xirdalan");
        System.out.println(seherler);

    }
}
