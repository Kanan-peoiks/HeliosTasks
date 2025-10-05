package lesson6.task1;

public class Main {
    public static void main(String[] args) {
        SmartWatch watch = new SmartWatch("apple", "hav5",false);
        SmartSpeaker speaker = new SmartSpeaker("apple speaker", "son model", false);
        SmartFridge fridge = new SmartFridge("apple fridge", "ikinci model", false, 10);

        watch.connectToWiFi();
        watch.trackHeartRate();
        watch.disconnect();

        System.out.println(); // BOSLUQ UCUN

        speaker.connectToWiFi();
        speaker.playMusic();
        speaker.disconnect();

        System.out.println();

        fridge.connectToWiFi();
        fridge.showTemperature();
        fridge.disconnect();



    }
}
