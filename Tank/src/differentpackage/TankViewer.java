package differentpackage;

import samepackage.Tank;

public class TankViewer {

    // Constructor
    public TankViewer() {
    }

    // Method to display tank details
    public void displayTankDetails(Tank tank) {
        System.out.println("Model: " + tank.getModel());
        System.out.println("Capacity: " + tank.getCapacity() + " liters");
        System.out.println("Engine Power: " + tank.getEnginePower() + " HP");
        System.out.println("Armored: " + (tank.isArmored() ? "Yes" : "No"));
        System.out.println("Country of Origin: " + tank.getCountryOfOrigin());
    }
}
