package lesson13;

import java.util.ArrayList;

public class ArrayListTask4 {
    public static void main(String[] args) {
        ArrayList<Integer> dumble = new ArrayList<>();
        dumble.add(5);
        dumble.add(1);
        dumble.add(25);
        dumble.add(35);
        dumble.add(45);
        for (int i = 0; i < dumble.size(); i++) {
            System.out.println(dumble.get(i));
                    }
        System.out.println("___________________________");
        for (int i = 0; i < dumble.size(); i++) {
            if (dumble.get(i) >=5 ){
                System.out.println(dumble.get(i));
            }
        }

    }
}
