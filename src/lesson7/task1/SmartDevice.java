package lesson7.task1;

public class SmartDevice {
        protected String brand;
        protected String model;
        protected boolean isOnline;


    public SmartDevice (String brand, String model, boolean isOnline){
        this.brand=brand;
        this.model=model;
        this.isOnline=isOnline;
    }
    //GET VE SET PRIVATE OLDUQDA YAZILIR, AMMA SILMEYE ERINDIM DEYE SAXLADIM, MEN DE PROTECTEDDIR DEYE EHTIYAC YOXDU
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public void connectToWiFi() {
        this.isOnline = true;
        System.out.println(brand + " " + model + " internetə qoşuldu.");
    }

    public void disconnect() {
        this.isOnline = false;
        System.out.println(brand + " " + model + " internetdən ayrıldı.");
    }


}
