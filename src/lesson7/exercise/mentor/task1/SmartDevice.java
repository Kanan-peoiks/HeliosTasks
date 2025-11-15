package lesson7.exercise.mentor.task1;

public class SmartDevice {
    String brand;
    String model;
    boolean isOnline;

    public SmartDevice(String brand, String model, boolean isOnline) {
        this.brand = brand;
        this.model = model;
        this.isOnline = isOnline;
    }


    void connectToWifi(){
        System.out.println("internete baglidir");
    }
    void disconnect (){
        System.out.println("internete bagli deyil");
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", isOnline=" + isOnline +
                '}';
    }
}
