package lesson6.ooptekrar.persia;

public class Main {
    public static void main(String[] args) {
        OrangePersianCat garfield = new OrangePersianCat();
garfield.name = "Garfield";
garfield.age = 5;
garfield.furColor = "brown";

        garfield.qachmaq();

garfield.ozunuTani();
        System.out.println(garfield);

        int netice = garfield.calculator(10,243123);
        System.out.println(netice);


    }
}
