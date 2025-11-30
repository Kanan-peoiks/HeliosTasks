package lesson19.classtask.taskOptional;

public class Ticket {
    String movieName;
    MovieGenre genre;
    Double price;
    Boolean isAvailable;

    public Ticket(String movieName, MovieGenre genre, Double price, Boolean isAvailable) {
        this.movieName = movieName;
        this.genre = genre;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getMovieName() {
        return movieName;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public Double getPrice() {
        return price;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public static void teqdimat (Ticket ticket){
        if (ticket.isAvailable == true){
        System.out.println("------------------------------------");
        System.out.println("\uD83C\uDFAC Film: " + ticket.getMovieName());
        System.out.println("\uD83D\uDCFD\uFE0F Janr: " +ticket.getGenre());
        System.out.println("\uD83D\uDCB5 Qiymət: "+ticket.getPrice() + " AZN");
        System.out.println("------------------------------------");}
    }
}
