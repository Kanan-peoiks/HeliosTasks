package lesson16.hometask.task2;


public class Main {
    public static void main(String[] args) {

        MilkPreparation milkPreparation = new MilkPreparation();
        CoffeeShotPreparation coffeeShotPreparation = new CoffeeShotPreparation();
        CupPreparation cupPreparation = new CupPreparation();

        milkPreparation.start();
        coffeeShotPreparation.start();
        cupPreparation.start();

        try {
            milkPreparation.join();
            coffeeShotPreparation.join();
            cupPreparation.join();
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        //HEMEN LATTE HAZIRDIR GELMESIN
        try{
            Thread.sleep(1000);
            System.out.println("Latte hazirdir. ");
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }


    }
}
