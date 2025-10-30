package lesson13;

import java.util.LinkedList;

public class LinkedListTask4 {
    public static void main(String[] args) {
        LinkedList<String> printerIsi = new LinkedList<>();

        printerIsi.add("Masin cap et");
        printerIsi.add("Oyuncaq cap et");
        printerIsi.add("Tutacaq cap et");
        printerIsi.add("Qelem qapi cap et");
        System.out.println(printerIsi);
        printerIsi.removeLast();
        System.out.println(printerIsi);
    }
}
