package com.xworkz.ub.Runner;

import com.xworkz.ub.external.BankTransaction;
import com.xworkz.ub.internal.DepositTransaction;

public class BankTransactionRunner {

    public static void main(String[] args) {

        BankTransaction bankTransaction = new DepositTransaction();
        bankTransaction.VerifyAccount();
        bankTransaction.AccountHolder();

    }
}
