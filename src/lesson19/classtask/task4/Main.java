package lesson19.classtask.task4;


import static lesson19.classtask.task4.CardType.printCardInfo;

public class Main {
    public static void main(String[] args) {

        printCardInfo(CardType.DEBIT);
        printCardInfo(CardType.CREDIT);
        printCardInfo(CardType.VIRTUAL);
        printCardInfo(CardType.PREMIUM);


    }
}
