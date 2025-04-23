package com.xworkz.ub.internal;

import com.xworkz.ub.external.BankTransaction;

import java.sql.SQLOutput;

public class DepositTransaction extends BankTransaction {

    @Override
    public void VerifyAccount() {
        System.out.println("account verified in deposit");
    }

    @Override
    public void AccountHolder(){
        System.out.println("Account holder in deposit");

    }



}


