package ferdi;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();

        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            list.add(x);
        }

        for (int list1 : list ){
            System.out.print(list1 + " ");
        }





    }
}

