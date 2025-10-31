package lesson14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTask2 {
    public static void main(String[] args) {
        Set<String> telebeler = new LinkedHashSet<>();
telebeler.add("kenan");
        telebeler.add("azer");
        telebeler.add("senan");
        telebeler.add("akif");
        telebeler.add("kenan");
        System.out.println(telebeler);

    }
}
