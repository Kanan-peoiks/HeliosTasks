package lesson6.task1;

public class SmartWatch extends SmartDevice {

        public SmartWatch (String brand, String model, boolean isOnline) {
            super(brand, model, isOnline); // valideyn constructoru çağırıldı
        }


    @Override
    public void connectToWiFi() {
        super.connectToWiFi(); // valideynin davranışını saxlaya bilərik
        System.out.println("⌚ Saat artıq məlumat toplayır. ");
    }

    @Override
    public void disconnect() {
        super.disconnect();
        System.out.println("⌚ Saat sinxronizasiyanı dayandırdı.");
    }

    public void trackHeartRate() {
        // Simulyasiya
        System.out.println("♥️ Sənəd: Ürək döyünməsi: 77 bpm.");
    }
}
