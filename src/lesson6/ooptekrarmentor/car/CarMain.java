package lesson6.ooptekrarmentor.car;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

        Car[] car = new Car[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Brand daxil et: ");
            String brand = scan.nextLine();

            System.out.println("Modeli daxil et: ");
            String model =scan.nextLine();

            System.out.println("Ili daxil et: ");
            int year = scan.nextInt();
            scan.nextLine();
car[i] = new  Car (brand, model, year);
        }

        for (Car c : car){
            c.showDetails();
            System.out.println("_________________");
        }

    }
}
