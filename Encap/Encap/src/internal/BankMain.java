package internal;

import external.BankAccount;
import external.CheckingAccount;

public class BankMain {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new CheckingAccount();
        bankAccount1.Withdraw();

        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.deposit();
    }
}
