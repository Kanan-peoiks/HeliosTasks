package lesson16;

public class Main {
    public static void main(String[] args) {

        TeaMaker teaMaker = new TeaMaker();
        TablePreparation tablePreparation = new TablePreparation();

        teaMaker.start();

        tablePreparation.start();

        try {
            teaMaker.join(); //1 saniye
            tablePreparation.join(); //0.7 saniye
                    }
            catch (InterruptedException e){
            Thread.currentThread().interrupt();
            }


    }
}
