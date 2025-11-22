package lesson16.hometask.task1;

public class Main {

    public static void main(String[] args) {

        CustomerOrder customerA = new CustomerOrder("A","Latte");
        CustomerOrder customerB = new CustomerOrder("B","Capucinno");
        CustomerOrder customerC = new CustomerOrder("C", "Esperesso");

//        customerA.run();
//        customerB.run();
//        customerC.run();
        //BUNA SEHVDIR CUNKI NOVBE ILE YAZACAQ, MENE LAZIMDIR KI, KIMINKI HAZIRDIR TEHVIL VERILSIN

        Thread treadA = new Thread(customerA, "Musteri A");
        Thread treadB = new Thread(customerB, "Musteri B");
        Thread treadC = new Thread(customerC, "Musteri C");

        treadA.start();
        treadB.start();
        treadC.start();

        //JOIN YAZMAGA EHTIYAC YOXDUR, BU HALDA BIR MENTIQI OLMAYACAQ, HAZIR OLAN YENE GOZLEYECEK KI, ILKIN SIFARIS HAZIR OLSUN




    }
}
