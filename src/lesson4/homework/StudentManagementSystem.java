package lesson4.homework;

import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int choice;
        int choice2; //switchde istifade edirem

        System.out.println("Zehmet olmasa telebe sayini daxil edin: ");
        int telebesayi = scan.nextInt(); // telebe sayini tapiram ki, siyahida ve ballari oyrenmek ucun qeyd edim

        int [] grade = new int[telebesayi]; //bal ucun
        double ortalama = 0; //bal ucun ortalama
        char letterGrade; //bali herfe cevirmek ucun

        int kecenTelebe = 0;
        int qalanTelebe = 0;

        int [] yash = new int[telebesayi];
        double ortalama2 = 0; //yas ucun ortalama


        scan.nextLine(); // QAYDA UZRE EGER STRING OLMASA SILECEM

        String [] siyahi = new String [telebesayi];

        for (int i = 0; i < siyahi.length; i++) { //telebeSayinaUygunTelebeleriElaveEdecem
            System.out.println((i+1)+". Zehmet olmasa adi daxil edin: ");
            siyahi[i]= scan.nextLine();}

        for (int j = 0; j < siyahi.length; j++) { //telebeSayinaUygunBallariElaveEdecem
                System.out.println("Zehmet olmasa imtahan balini daxil edin. Telebe: "+siyahi[j]);
                grade[j] = scan.nextInt();
                ortalama += grade[j];
                scan.nextLine();
        }
        for (int j = 0; j < siyahi.length; j++) { //telebelerinYasiniElaveEdecem
            System.out.println("Zehmet olmasa yasinizi daxil edin. Telebe: "+siyahi[j]);
            yash[j]= scan.nextInt();
            ortalama2 +=yash[j];
            scan.nextLine();
        }
    do {
            System.out.println("1. Bütün tələbələri göstər");
            System.out.println("2. Statistikaları göstər");
            System.out.println("0. Çıxış");
            choice = scan.nextInt();


            switch (choice) {
                case 1:
                    for (int i = 0; i < siyahi.length; i++) { //telebeSayinaUygunTelebeleriEkrandaGosterecem
                        System.out.println((i+1)+ ". Telebe: "+ siyahi[i]);
                    }
                    System.out.println("----------------------");
                    break;
                case 2:
                    System.out.println("Sinif Statistikaları: \n " +
                            "1. Orta qiymət\n " +
                            "2. Ən yüksək və ən aşağı qiymət\n " +
                            "3. Keçən və qalan tələbələrin sayı\n " +
                            "4. Orta yaş \n");
                    choice2 = scan.nextInt();
                    switch (choice2){
                        case 1:
                            ortalama = ortalama / telebesayi;
                            System.out.println("Orta qiymet: "+ortalama);
                            break;
                        case 2:
                            int maxBal = grade[0];
                            int minBal = grade[0];
                            for (int i = 1; i < grade.length; i++) {
                                if (grade[i] > maxBal) {
                                    maxBal = grade[i];
                                }
                                if (grade[i] < minBal) {
                                    minBal = grade[i];
                                }
                            }
                            System.out.println("Yuksek qiymet: "+maxBal+". asagi qiymet: "+minBal);
                            break;
                        case 3:
                            for (int i = 0; i < grade.length; i++) {
                                if (grade[i] > 50){
                                    kecenTelebe += 1;
                                }
                                else {
                                    qalanTelebe += 1;
                                }
                            }
                            System.out.println("Keçən telebeler "+kecenTelebe+". Qalan telebeler: "+qalanTelebe);
                            break;
                        case 4:
                            ortalama2 = ortalama2 / telebesayi;
                            System.out.println("Orta yas: "+ortalama2);
                            break;
                        default:
                            System.out.println("Bele bir secimininiz yoxdur. ");
                    }
                    break;
                case 0:
                    System.out.println("Çıxılır...");
                    break;
                default:
                    System.out.println("Yanlış seçim!");
            }
        } while (choice != 0);






        scan.close();
    }
}
