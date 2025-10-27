package lesson13;

import java.sql.Array;
import java.util.ArrayList;

public class ArrayListTask1 {
    public static void main(String[] args) {
        ArrayList<String> futbolcular = new ArrayList<>();
        futbolcular.add("RAMOS");
        futbolcular.add("Marcelo");
        futbolcular.add("Casillas");
        futbolcular.add("Asencio");
        futbolcular.add("Ceballos");

        for (int i = 0; i < futbolcular.size(); i++) {
            System.out.println((i+1)+". " +"Futbolcu: "+futbolcular.get(i));
        }
    }
}
