package lesson13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Classwork {
    public static void main(String[] args) {
        List <Integer> arrayList= new ArrayList<>();
        List <Integer> linkedList = new LinkedList<>();
//        long start = System.nanoTime();
//        for (int i = 0;i<10000; i++){
//            arrayList.add(0,i);
//        }
//        long end = System. nanoTime();
//        System.out.println("ArrayList bashdan elave edildi.."+     (end-start));
//        long start2 = System.nanoTime();
//        for (int i = 0;i<10000; i++){
//            linkedList.add(0,i);
//        }
//        long end2 = System. nanoTime();
//
//        System.out.println("LinkedList bashdan elave edildi.."+     (end2-start2));

        for (int i = 0; i < 1_000_000; i++) {

            arrayList.add(i);
            linkedList.add(i);
            
        }
            long start =System.nanoTime();
        arrayList.get(501334);
        long end = System.nanoTime();
        System.out.println("Array: " + (end - start));

        long start2 =System.nanoTime();
        linkedList.get(501334);
        long end2 = System.nanoTime();
        System.out.println("LinkedList: " + (end2 - start2));

    }
}
