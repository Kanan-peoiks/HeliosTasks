package lesson21.classTask.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list =new ArrayList<>();

        list.add("maga");
        list.add("sehriyar");
        list.add("kerem");
        list.add("seyfullah");
        list.add("fidan");
        list.add("kenan");
        list.add("rehman");
        list.add("agaselim");

        List<String> filtered = list.stream()
                .filter(w -> w.length()>5)
                .toList();
        System.out.println(filtered);


    }
}
