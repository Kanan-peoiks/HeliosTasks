package lesson15;

import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        HashMap<String, Integer> student = new HashMap<>();

        student.put("Anar", 76);
        student.put("Orxan", 90);
        student.put("Xeyale", 85);
        student.put("Murad", 78);

        for (Map.Entry<String, Integer> entry : student.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }












    }
}
