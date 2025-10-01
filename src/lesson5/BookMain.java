package lesson5;

public class BookMain {
    public static void main(String[] args) {
        Book Book =new Book("Java", "James Gosling", 200);


        System.out.println("Book: " + Book.getName()+", Author: "+Book.getAuthor()+", Page count: "+Book.getPageCount());

        Book.setName("Java Programming Language");
        Book.setPageCount(350);


        System.out.println("Updated Book: " + Book.getName() +
                ", Pages: " + Book.getPageCount());
    }
}
