package lesson7.exercise.mentor.task1;

public class SmartFridge extends SmartDevice {
    int coolingLevel;

    public SmartFridge(String brand, String model, boolean isOnline, int coolingLevel) {
        super(brand, model, isOnline);
        this.coolingLevel = coolingLevel;
    }

    void showTemp (){
        System.out.println("Temp: ");
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
