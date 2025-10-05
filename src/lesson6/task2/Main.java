package lesson6.task2;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("Dinle, Kucuk Adam", 15, "Wilhem");
        Electronic electronic = new Electronic("soyuducu", 250, "bosh");

        book.displayInfo();
        book.applyDiscount(10); //endirimin faizini daxil edirem
        book.displayInfo(); //yeni qiymet ile

        electronic.displayInfo();
        electronic.applyDiscount(13); //endirimin faizini daxil edirem
        electronic.displayInfo(); //yeni qiymet ile
    }
}