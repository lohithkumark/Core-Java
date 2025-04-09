package Weapon;

import Tool.Tool;  // Importing Tool class

public class Weapon extends Tool {
    // Attributes of Weapon
    String type;
    boolean isLoaded;

    public void aim() {
        System.out.println("Aiming the weapon...");
    }

    public void shoot() {
        System.out.println("Shooting the weapon...");
    }
}
