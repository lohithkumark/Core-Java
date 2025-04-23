package com.xworkz.ub.internal;

import com.xworkz.ub.external.Animal;

public class Dog implements Animal {

    @Override
    public void makesound() {
        System.out.println("DOG barks ");
    }


    public void sleep() {
        System.out.println("It is sleeping");
    }
}


