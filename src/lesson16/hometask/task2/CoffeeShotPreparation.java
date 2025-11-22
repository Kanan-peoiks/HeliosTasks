package lesson16.hometask.task2;

public class CoffeeShotPreparation extends Thread{



    @Override
    public void run(){

        try{
            System.out.println("Espresso shot hazırlanmas...");
            Thread.sleep(2000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("Bu mərhələ hazırdır.");
    }
}
