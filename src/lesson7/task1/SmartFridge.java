package lesson7.task1;

public class SmartFridge extends SmartDevice {
    private int coolingLevel;


    public SmartFridge (String brand, String model, boolean isOnline, int coolingLevel) {
        super(brand, model, isOnline); // valideyn constructoru çağırıldı
        this.coolingLevel=coolingLevel;
    }

    public int getCoolingLevel() {
        return coolingLevel;
    }

    public void setCoolingLevel(int coolingLevel) {
        this.coolingLevel = coolingLevel;
    }
    @Override
    public void connectToWiFi() {
        super.connectToWiFi();
        System.out.println("🧊 Soyuducu məhsulların siyahısını sinxronlaşdırır (cooling level: " + coolingLevel + ").");
    }

    @Override
    public void disconnect() {
        super.disconnect();
        System.out.println("🧊 Soyuducu sinxronizasiyanı dayandırdı.");
    }

    public void showTemperature() {
        // sadə simulyasiya: coolingLevel -> temperatur
        int temp = 5 - coolingLevel; // nümunə hesablama
        System.out.println("🌡️ Cari daxili temperatur: " + temp + "°C.");
    }

}
