package lesson19.hometaskMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BankAccount account =  new BankAccount(450.0);

        Scanner scan = new Scanner(System.in);
        System.out.println("balansin: " + account.getAccountBalans());
        System.out.println("depozit etmek istediyin mebleg: ");
        String n = scan.nextLine();

        account.performTransaction(TransactionType.DEPOSIT,n);
        System.out.println("depozitden onceki balans: " + account.getAccountBalans());

        System.out.println("cekmek etmek istediyin mebleg: ");
        String m = scan.nextLine();
        account.performTransaction(TransactionType.WITHDRAWAL, m);
        System.out.println("pul cekenden sonraki balans: "+account.getAccountBalans());

    }
}
