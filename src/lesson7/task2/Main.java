package lesson7.task2;

import lesson7.homework.Clothing;
import lesson7.homework.Technology;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Dinle, Kucuk Adam", 15, "Wilhem");
        Electronic electronic = new Electronic("soyuducu", 250, "bosh");
        Clothing clothing = new Clothing("gucci", 150,"M");
        Technology technology = new Technology("redmi", 399, 2);


        book.displayInfo();
        book.applyDiscount(10); //endirimin faizini daxil edirem
        book.displayInfo(); //yeni qiymet ile
        System.out.println();
        electronic.displayInfo();
        electronic.applyDiscount(13); //endirimin faizini daxil edirem
        electronic.displayInfo(); //yeni qiymet ile
        System.out.println();
        clothing.displayInfo();
        clothing.applyDiscount(9); //endirimin faizini daxil edirem
        clothing.displayInfo(); //yeni qiymet ile
        System.out.println();
        technology.displayInfo();
        technology.applyDiscount(3.3); //endirimin faizini daxil edirem
        technology.displayInfo(); //yeni qiymet ile
    }
}