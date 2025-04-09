package Cactus;

import Plant.Plant;  // Importing Plant class

public class Cactus extends Plant {
    // Attributes of Cactus
    int numberOfThorns;

    public void storeWater() {
        System.out.println("The cactus is storing water...");
    }

    public void surviveInDesert() {
        System.out.println("The cactus is surviving in the desert...");
    }
}
