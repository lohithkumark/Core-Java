package samepackage;

import differentpackage.TankViewer;

public class Main {

    // Main method to drive the application
    public static void main(String[] args) {
        // Create a new Tank object
        Tank tank = new Tank();

        // Set the properties using setters
        tank.setModel("T-90");
        tank.setCapacity(1250);  // 1250 liters
        tank.setEnginePower(1130.5);  // 1130.5 horsepower
        tank.setArmored(true);
        tank.setCountryOfOrigin("Russia");

        // Create TankViewer and display the tank details
        TankViewer tankViewer = new TankViewer();
        tankViewer.displayTankDetails(tank);

        // Print additional details
        System.out.println("\nValues in Tank:");
        System.out.println("Model: " + tank.getModel());
        System.out.println("Capacity: " + tank.getCapacity() + " liters");
        System.out.println("Engine Power: " + tank.getEnginePower() + " HP");
        System.out.println("Armored: " + (tank.isArmored() ? "Yes" : "No"));
        System.out.println("Country of Origin: " + tank.getCountryOfOrigin());
    }
}
