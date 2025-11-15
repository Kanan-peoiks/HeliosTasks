package lesson16.task2;

public class People extends Thread{
 private final String name;

    public People(String name1) {

        this.name = name1;
    }

    @Override
    public void run (){
        System.out.println(Thread.currentThread().getName()+ " " + name +" kartdan pul çıxarır...");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
            return;
        }

    }



}
