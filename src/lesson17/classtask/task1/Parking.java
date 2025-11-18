package lesson17.classtask.task1;

public class Parking {
    private boolean empty = true;

    public synchronized void park ( String carName){
        while ( !empty) {
            try {
                wait();}
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();}
        }
        empty = false;
        System.out.println(carName + " park yerinə daxil oldu");
    }

    public synchronized void leave (String carName){
        empty = true;
        System.out.println(carName + " park yerindən çıxdı");
        notify();
    }
}
