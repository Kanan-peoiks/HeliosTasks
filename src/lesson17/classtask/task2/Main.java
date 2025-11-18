package lesson17.classtask.task2;

public class Main {
    public static void main(String[] args) {
Atm atm = new Atm();

Thread customer1 = new Thread(new AtmDemo(atm, "Customer 1"));
        Thread customer2 = new Thread(new AtmDemo(atm, "Customer 2"));
        Thread customer3 = new Thread(new AtmDemo(atm, "Customer 3"));

customer1.start();
customer2.start();
customer3.start();



    }
}
