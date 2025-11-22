package lesson16.hometask.task1;

public class CustomerOrder implements Runnable{
    String customerName;
    String drink;

    public CustomerOrder(String customerName, String drink) {
        this.customerName = customerName;
        this.drink = drink;
    }

    public void run(){
        System.out.println("Sifaris hazirlanir");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        }
        System.out.println("Musteri: "+customerName+", sifaris: "+drink + " hazirdi");
    }
}
