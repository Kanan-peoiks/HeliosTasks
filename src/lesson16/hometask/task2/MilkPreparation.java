package lesson16.hometask.task2;

public class MilkPreparation extends Thread{


    @Override
    public void run(){

        try{
            System.out.println("Südün köpürdülməsi...");
            Thread.sleep(3000);
        }catch (InterruptedException e){
        Thread.currentThread().interrupt();
        }
        System.out.println("Bu mərhələ hazırdır.");
    }



}
