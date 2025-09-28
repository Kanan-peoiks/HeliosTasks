package lesson4.homework;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int choice;
        int choice2; //switchde istifade edirem

        System.out.println("Zehmet olmasa telebe sayini daxil edin: ");
        int telebesayi = scan.nextInt(); // telebe sayini tapiram ki, siyahida ve ballari oyrenmek ucun qeyd edim

        int [] grade = new int[telebesayi]; //bal ucun
        double ortalama = 0.0; //bal ucun ortalama
        char [] letterGrade = new char [telebesayi]; //bali herfe cevirmek ucun

        int kecenTelebe = 0;
        int qalanTelebe = 0;

        int [] yash = new int[telebesayi];
        double ortalama2 = 0.0; //yas ucun ortalama


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
        for (int j = 0; j < grade.length; j++) {
            if (grade[j] > 90) {
                letterGrade [j] = 'A';
                //System.out.println("Imtahandan aldiginiz netice->" + letterGrade);
            } else if (grade[j] > 80) {
                letterGrade [j] = 'B';
                //System.out.println("Imtahandan aldiginiz netice->" + letterGrade);
            } else if (grade[j] > 70) {
                letterGrade [j] = 'C';
                //System.out.println("Imtahandan aldiginiz netice->" + letterGrade);
            } else if (grade[j] > 60) {
                letterGrade [j] = 'D';
                //System.out.println("Imtahandan aldiginiz netice->" + letterGrade);
            }
            else if (grade[j] > 50) {
                letterGrade [j] = 'E';
                //System.out.println("Imtahandan aldiginiz netice->" + letterGrade);
            }
            else {
                letterGrade [j] = 'F';
                //System.out.println("Imtahandan aldiginiz netice->" + letterGrade);
            }
        }
        System.out.println();
        for (int j = 0; j < siyahi.length; j++) { //telebelerinYasiniElaveEdecem
            System.out.println("Zehmet olmasa yasinizi daxil edin. Telebe: "+siyahi[j]);
            yash[j]= scan.nextInt();
            ortalama2 +=yash[j];
            scan.nextLine();
        }
    do {
            System.out.println("1. Bütün tələbələri göstər");
            System.out.println("2. Statistikaları göstər");
            System.out.println("3. Tələbə axtarış sistemi: ");
            System.out.println("0. Çıxış");
            choice = scan.nextInt();


            switch (choice) {
                case 1:
                    for (int i = 0; i < siyahi.length; i++) { //telebeSayinaUygunTelebeleriEkrandaGosterecem
    System.out.println((i+1)+ ". Telebe-> \n "+
            "Ad: "+ siyahi[i] +
            " \nImtahan bali: "+ grade[i] + " "+letterGrade[i]+
            " \nYas: "+ yash[i] );
                    }

                    System.out.println("----------------------");
                    break;
                case 2:
                    do {
                        System.out.println("Sinif Statistikaları: \n " +
                                "1. Orta qiymət\n " +
                                "2. Ən yüksək və ən aşağı qiymət\n " +
                                "3. Keçən və qalan tələbələrin sayı\n " +
                                "4. Orta yaş\n " +
                                "5. Qiymətə görə sıralama\n " +
                                "6. Yaş aralığı\n " +
                                "0. Çıxış... \n");
                        choice2 = scan.nextInt();

                        switch (choice2) {
                            case 1:
                                double avg = ortalama / telebesayi;
                                System.out.println("Orta qiymet: " + avg);
                                ortalama = 0.0;
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
                                System.out.println("Yuksek qiymet: " + maxBal + ". asagi qiymet: " + minBal);
                                break;
                            case 3:
                                for (int i = 0; i < grade.length; i++) {
                                    if (grade[i] > 50) {
                                        kecenTelebe += 1;
                                    } else {
                                        qalanTelebe += 1;
                                    }
                                }
                                System.out.println("Keçən telebeler " + kecenTelebe + ". Qalan telebeler: " + qalanTelebe);
                                kecenTelebe = 0;
                                qalanTelebe = 0;
                                break;
                            case 4:
                                ortalama2 = ortalama2 / telebesayi;
                                System.out.println("Orta yas: " + ortalama2);
                                ortalama2=0.0;
                                break;
                            case 5:
                                System.out.println("Qiymət sıralaması: ");
                                Arrays.sort(grade);
                                System.out.print("");
                                for (int sort : grade)
                                { System.out.print(sort + " ");
                                    System.out.println();}
                                break;
                            case 6:
                                System.out.println("Zəhmət olmasa minimum yaş aralığını qeyd edin: ");
                                int min = scan.nextInt();
                                System.out.println("Zəhmət olmasa maksimum yaş aralığını qeyd edin: ");
                                int max = scan.nextInt();
                                for (int i = 0; i < yash.length; i++) {
                                    if (yash[i]>=min && yash[i]<=max){
                    System.out.println((i+1)+ ". Telebe-> "+ "Ad: "+ siyahi[i] + " Imtahan bali: "+ grade[i] + " "+letterGrade[i]+ " Yas: "+ yash[i] );
                                    }
                                }
                                break;
                            case 0:
                                System.out.println("Çıxılır...");
                                break;
                            default:
                                System.out.println("Bele bir secimininiz yoxdur. ");
                        }
                    }
                    while (choice2!=0);
                    break;
                case 3:
                    System.out.println("Zəhmət olmasa ad daxil edin: ");
                    scan.nextLine();
                    String axtaris = scan.nextLine();
                    for (int i = 0; i < siyahi.length; i++) {
                            if (axtaris.equals(siyahi[i])){
                    System.out.println("Telebe-> "+ "Ad: "+ siyahi[i] + " Imtahan bali: "+ grade[i] + " "+letterGrade[i]+ " Yas: "+ yash[i]);}
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
