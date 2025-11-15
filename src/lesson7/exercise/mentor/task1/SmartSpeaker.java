package lesson7.exercise.mentor.task1;

public class SmartSpeaker extends SmartDevice {
    public SmartSpeaker(String brand, String model, boolean isOnline) {
        super(brand, model, isOnline);
    }

    void playMusic (){
        System.out.println("musiqi calinir");
    }

    @Override
    void connectToWifi() {
        System.out.println(" internete qosuldu");
        isOnline = true;
    }

    @Override
    void disconnect() {
        System.out.println(" internete qosulmadi");
        isOnline = false;
    }
}
