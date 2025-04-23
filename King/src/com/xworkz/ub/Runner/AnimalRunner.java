package com.xworkz.ub.Runner;

import com.xworkz.ub.external.Animal;
import com.xworkz.ub.internal.Cat;
import com.xworkz.ub.internal.Dog;

public class AnimalRunner {

    public static void main(String[] args) {

        Animal myDog = new Dog();
        myDog.sleep();
        Animal myCat = new Cat();
    }
}
