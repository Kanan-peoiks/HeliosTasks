package lesson13;

import java.util.LinkedList;

public class LinkedListTask1 {
    public static void main(String[] args) {
        LinkedList <String> novbe = new LinkedList<>();
        novbe.add("Akif");
        novbe.add("asif");
        novbe.add("vasif");
        novbe.add("vahid");
        System.out.println(novbe);
        novbe.addFirst("MEN");
        novbe.removeLast();

            System.out.println(novbe);

    }
}
