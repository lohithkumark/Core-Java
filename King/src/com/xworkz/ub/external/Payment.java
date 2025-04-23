package com.xworkz.ub.external;

public abstract class Payment {

    public abstract void Payment();

    public void withdrawl(){
        System.out.println("WithDrawing the amount");
    }

    public void printReceipt() {
        System.out.println("Receipt has been printed.");
    }
}
