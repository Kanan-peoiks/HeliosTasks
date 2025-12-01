package lesson19.classtask.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        List<Double> list = new ArrayList<>();
//    list.add(30.);
//    list.add(23.111);
//    list.add(123.1);
//
//    for(Double list1 : list){
//        System.out.println(list1);
//    }

//----
        Scanner scan = new Scanner(System.in);
    ArrayList<Double> dbs = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Double n = scan.nextDouble();
            dbs.add(n);
        }
        double count = 0;
        for(Double dbs1 : dbs ){
            count += dbs1;
        }
        System.out.println(count);






    }
}
