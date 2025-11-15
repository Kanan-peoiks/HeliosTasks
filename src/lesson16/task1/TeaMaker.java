package lesson16.task1;

public class TeaMaker extends Thread {

    @Override
    public void run () {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "Cay demlenir...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }


    }
}
