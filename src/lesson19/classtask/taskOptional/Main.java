package lesson19.classtask.taskOptional;

import lesson19.classtask.task3.WeekDay;
import lesson19.classtask.taskOptional.MovieGenre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İzləmək istədiyiniz janrı seçin: ACTION, COMEDY, DRAMA, HORROR, SCIFI");
        MovieGenre genre = null;
    try{
        String x = scan.nextLine().toUpperCase();
        genre = MovieGenre.valueOf(x.toUpperCase());}
    catch (IllegalArgumentException e){
    System.out.println("Janr düzgün seçilməyib.");
        }

        Ticket ticket = new Ticket("Squid Game",MovieGenre.ACTION,10.0,true);
        Ticket ticket2 = new Ticket("The Walking Dead",MovieGenre.SCIFI,23.0,true);
        Ticket ticket3 = new Ticket("Prison Break",MovieGenre.ACTION,15.0,false);
        Ticket ticket4 = new Ticket("Breaking Bad",MovieGenre.ACTION,13.0,false);
        Ticket ticket5 = new Ticket("Alice in borderland",MovieGenre.ACTION,15.0,true);
        Ticket ticket6 = new Ticket("All of use are dead",MovieGenre.SCIFI,25.0,true);
        Ticket ticket7 = new Ticket("The Menu",MovieGenre.HORROR,20.0,true);
        Ticket ticket8 = new Ticket("Borat",MovieGenre.COMEDY,17.0,false);
        Ticket ticket9 = new Ticket("All Quiet On The Western Front",MovieGenre.DRAMA,28.0,true);

        List<Ticket> tickets = new ArrayList<>();
        tickets.add(ticket);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);
        tickets.add(ticket6);
        tickets.add(ticket7);
        tickets.add(ticket8);
        tickets.add(ticket9);

        if (genre!=null) {
            for (Ticket ticket1 : tickets) {
                if (ticket1.getGenre() == genre) {
                    Ticket.teqdimat(ticket1);
                }
            }
        }

    }
}
