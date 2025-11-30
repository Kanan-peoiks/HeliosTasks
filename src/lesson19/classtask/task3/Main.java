package lesson19.classtask.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        try {
            WeekDay day = WeekDay.valueOf(str.toUpperCase());
            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                    System.out.println("Bu gün iş günüdür");
                    break;
                case SATURDAY:
                    System.out.println("Bu gün iş günü ola da bilər, olmaya da bilər.");
                    break;
                case SUNDAY:
                    System.out.println("Bu gün istirahət günüdür");
                    break;
                default:
                    System.out.println("Yanlış gün daxil etdiniz.");
                    //DEFAULT HEC VAXT ISLEMEYECEK CUNKI CATCH BIRINCI TUTUR
            }
        }catch (IllegalArgumentException e){
            System.out.println("Belə bir seçim yoxdur");
        }
    }
}
