package lesson16.classtask.task2;

public class Main {
    public static void main(String[] args) {
    People p1 = new People("Thread1","Akif");
    People p2 = new People("Thread2","Asif");
    People p3 = new People("Thread3","Arif");

    try {

        p1.start();
        p1.join();

        p2.start();
        p2.join();

        p3.start();
        p3.join();
    }catch (InterruptedException e){
        Thread.currentThread().interrupt();

    }
        System.out.println("Bütün müştərilər xidmət aldı.");

    }
}
