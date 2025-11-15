package lesson7.exercise.mentor.task2;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Labirent", 15, "James Dashener");

        Electronic elec1 = new Electronic("soyuducu", 300, "bosh");

        book1.displayInfo();
        book1.applyDiscount(15);

        elec1.displayInfo();
        elec1.applyDiscount(30);
        elec1.displayInfo();
    }
}
