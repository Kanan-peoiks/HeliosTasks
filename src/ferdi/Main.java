package ferdi;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int add = scan.nextInt();

            if (list.isEmpty()) {
                list.add(add);
            } else {
                int sonuncu = list.getLast();
                if (sonuncu != add) {
                    list.add(add);
                }
            }
        }

        for (Integer list1 : list){
            System.out.print(list1+" ");
        }






    }
}


