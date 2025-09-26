package lesson1;

import java.util.Scanner;
public class Lessson1 {
    public static void main(String[] args) {
// data_type variable = value

        Scanner scanner = new Scanner(System.in);
        System.out.println("yasinizi daxil edin : ");
int age = scanner.nextInt();
scanner.nextLine(); //YAZILMASA AD HİSSƏSİNƏ KEÇMİR
        System.out.println("adinizi daxil edin : ");
        String name = scanner.nextLine();
        System.out.println("yasiniz: " + age);
       System.out.println("adiniz: " + name);

    }


}
