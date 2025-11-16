package lesson16.classtask.task3;

public class Cook extends Thread{
    private final String name;
    private final Knife knife;
    public Cook(String name, String name1, Knife knife) {
        super(name);
        this.name = name1;
        this.knife = knife;
    }

    @Override
    public void run() {
        synchronized (knife) {
            System.out.println(name + " bıçağı götürdü və tərəvəz doğrayır...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            System.out.println(name + " bıçağı buraxdı.");
        }
    }
}
