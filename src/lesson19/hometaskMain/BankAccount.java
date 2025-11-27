package lesson19.hometaskMain;

public class BankAccount {
    private Double accountBalans = 0.0;

    public BankAccount(Double accountBalans) {
        this.accountBalans = accountBalans;
    }

    public Double getAccountBalans() {
        return accountBalans;
    }
    public void performTransaction (TransactionType type, String amountStr){
            double amount  = Double.parseDouble(amountStr);

            switch (type){
                case DEPOSIT -> accountBalans = accountBalans + amount;
                case WITHDRAWAL ->  accountBalans = accountBalans - amount;
            }
    }



}

