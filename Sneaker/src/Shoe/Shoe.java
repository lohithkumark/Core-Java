package Shoe;

import Accessory.Accessory;  // Importing Accessory class

public class Shoe extends Accessory {
    // Attributes of Shoe
    String material;
    String size;

    public void laceUp() {
        System.out.println("Lacing up the shoe.");
    }

    public void walk() {
        System.out.println("Walking in the shoe.");
    }
}
