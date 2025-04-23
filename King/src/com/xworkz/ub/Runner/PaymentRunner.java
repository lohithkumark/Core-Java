package com.xworkz.ub.Runner;

import com.xworkz.ub.external.Payment;
import com.xworkz.ub.internal.CreditCard;

public class PaymentRunner {
    public static void main(String[] args) {

        Payment payment = new CreditCard();
        payment.Payment();
        payment.printReceipt();
        payment.withdrawl();

        }
    }

