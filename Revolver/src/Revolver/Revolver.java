package Revolver;

import Weapon.Weapon;  // Importing Weapon class

public class Revolver extends Weapon {
    // Attributes of Revolver
    int numberOfChambers;

    public void reload() {
        System.out.println("Reloading the revolver...");
    }

    public void spinCylinder() {
        System.out.println("Spinning the revolver's cylinder...");
    }
}
