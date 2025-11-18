package lesson17.classtask.task2;

public class Atm {
    private boolean busy =  false;

    public synchronized void useAtm (String customerName){
        while (busy){
            try{
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        busy = true;
        System.out.println(customerName + " atm-den istifade etdi.");
    }
    public synchronized void leaveAtm (String customerName){
        busy = false;
        System.out.println(customerName + " atm-i terk etdi");
        notifyAll();
    }




}
