package lesson13;

import java.util.LinkedList;

public class LinkedListTask2 {
    public static void main(String[] args) {
        LinkedList <String> mesajlar = new LinkedList<>();

        mesajlar.add("Salam");
        mesajlar.add("necesen");
        mesajlar.add("isler necedir");
        mesajlar.add("sagol");
        mesajlar.add("Salam");
        System.out.println(mesajlar);
        mesajlar.removeLast();
        System.out.println(mesajlar);

    }
}
