package lesson7.exercise.mentor.task2;

public class Book extends Product {
    String author;

    public Book(String name, int price, String author) {
        super(name, price);
        this.author = author;
    }


    @Override
    void displayInfo() {
        System.out.println("author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price);
    }


}
