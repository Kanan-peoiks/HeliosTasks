package lesson16.hometask.task2;

public class CupPreparation extends Thread{


@Override
    public void run(){

        try{
            System.out.println("Fincanın və sousun hazırlanması...");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("Bu mərhələ hazırdır.");
    }
}
