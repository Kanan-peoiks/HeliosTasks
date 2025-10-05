package lesson6.task1;

public class SmartSpeaker extends SmartDevice {
    public SmartSpeaker (String brand, String model, boolean isOnline) {
        super(brand, model, isOnline); // valideyn constructoru çağırıldı
    }

    @Override
    public void connectToWiFi() {
        super.connectToWiFi();
        System.out.println("🔊 Səsgücləndirici musiqi yayımlamağa hazırdır.");
    }

    @Override
    public void disconnect() {
        super.disconnect();
        System.out.println("🔊 Səsgücləndirici offline rejimə keçdi.");
    }

    public void playMusic() {
        if (isOnline) {
            System.out.println("♫ İcra olunur: Джаро & Ханза - Королева танцпола - SLOWED ...");
        } else {
            System.out.println("⚠️ Musiqi üçün internetə qoşulmalısınız.");
        }
    }


}

