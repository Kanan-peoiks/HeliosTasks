package lesson16.task2;

public class People extends Thread{
 private final String name;

    public People(String name, String name1) {
        super(name);
        this.name = name1;
    }

    @Override
    public void run (){
        System.out.println(name +" kartdan pul çıxarır...");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
            return;
        }
        System.out.println(name + " pul çıxardı və növbəni boşaltdı.");

    }



}
