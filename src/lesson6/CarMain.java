package lesson6;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Car [] cars = new Car[3];
        for (int i = 0; i < cars.length; i++) {
            System.out.print("Enter brand: ");
            String brand = scan.nextLine();

            System.out.print("Enter model: ");
            String model = scan.nextLine();

            System.out.print("Enter year: ");
            int year = scan.nextInt();
            scan.nextLine(); // qalan newline-i təmizləmək üçün
            System.out.println("----------------------");

            cars[i] = new Car(brand, model, year);
        }
        for (int i = 0; i < cars.length; i++) {
                cars[i].showDetails();
            System.out.println("----------------------");
            }
    }
}
