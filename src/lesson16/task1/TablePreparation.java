package lesson16.task1;

public class TablePreparation extends Thread{

    @Override
    public void run (){
        for (int i = 0; i < 7; i++) {
            System.out.println(Thread.currentThread().getName() + "Stekanlar hazirlanir...");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
                return;
            }

        }
    }








}
