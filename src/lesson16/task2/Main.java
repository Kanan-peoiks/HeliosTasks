package lesson16.task2;

import lesson8.task1.Trainable;

public class Main {
    public static void main(String[] args) {
    People p1 = new People("Akif");
    People p2 = new People("Asif");
    People p3 = new People("Arif");

    p1.start();
    p2.start();
    p3.start();

    try {
        p1.join();
        p2.join();
        p3.join();
    }catch (InterruptedException e){
        Thread.currentThread().interrupt();

    }


    }
}
