package lesson2.homework;

import java.util.Scanner;

public class L2HTask6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci ədədi daxil edin: ");
        int birinci = sc.nextInt();
        System.out.println("Ikinci ədədi daxil edin: ");
        int ikinci = sc.nextInt();
        int result;
        sc.nextLine();
        System.out.println("Operatoru daxil edin (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+' :
                result = birinci + ikinci;
                System.out.println("Nəticə: "+ result );
                break;
            case '-' :
                result = birinci - ikinci;
                System.out.println("Nəticə: "+ result);
                break;
            case '*' :
                result = birinci * ikinci;
                System.out.println("Nəticə: "+ result);
                break;
            case '/' :
                if( ikinci == 0){
                    System.out.println("Sıfıra bölmə yoxdur. ");
                    break;
                }
                result = birinci / ikinci;
                System.out.println("Nəticə: "+ result);
        break;
            default:
                System.out.println("Yanlış operator.");
        }
    }
}
