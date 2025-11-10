package lesson6.ooptekrarmentor.book;

public class BookMain {
    public static void main(String[] args) {
    Book book = new Book("Java 101", "James Gosling", 150);
        System.out.println(book.getName() + " " +book.getAuthor() + " "+ book.getPages()+" ");

book.setAuthor("Rowling");
book.setName("Harry Potter");
book.setPages(200);
        System.out.println(book.getName() + " " +book.getAuthor() + " "+ book.getPages()+" ");

        System.out.println(book);
    }
}
