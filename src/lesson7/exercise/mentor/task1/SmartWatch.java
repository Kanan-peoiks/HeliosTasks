package lesson7.exercise.mentor.task1;

public class SmartWatch extends SmartDevice {

    public SmartWatch(String brand, String model, boolean isOnline) {
        super(brand, model, isOnline);
    }

    void trackHeartRate (){
        System.out.println("urek doyuntusu");
    }

    @Override
    void connectToWifi() {
        System.out.println(brand + model + " internete qosuldu");
        isOnline = true;
    }

    @Override
    void disconnect() {
        System.out.println(brand + model + " internete qosulmadi");
        isOnline = false;
    }


}
