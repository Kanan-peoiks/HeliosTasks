package ferdi;

abstract class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void displayInfo();
}

class MyBook extends Book {
    int price;

    public MyBook(String title, String author, int price) {
        super(title, author); // parent constructor
        this.price = price;
    }

    @Override
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class hackerrank {
        public static void main(String args[]){
            Book s = new MyBook("Java","James Gosling", 15);
            s.displayInfo();







        }
}
