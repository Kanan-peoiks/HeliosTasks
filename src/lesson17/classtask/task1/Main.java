package lesson17.classtask.task1;

public class Main {
    public static void main(String[] args) {
Parking parking = new Parking();

Thread car1= new Thread(new Car(parking, "Car1"));
        Thread car2= new Thread(new Car(parking, "Car2"));

        car1.start();
        car2.start();

    }
}
