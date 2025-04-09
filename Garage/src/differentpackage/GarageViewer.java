package differentpackage;

import samepackage.Garage;

public class GarageViewer {

    // Constructor
    public GarageViewer() {
    }

    // Method to display garage details
    public void displayGarageDetails(Garage garage) {
        System.out.println("Garage Location: " + garage.getLocation());
        System.out.println("Capacity: " + garage.getCapacity() + " vehicles");
        System.out.println("Operational: " + (garage.isOperational() ? "Yes" : "No"));
        System.out.println("Owner: " + garage.getOwner());
        System.out.println("Vehicle Types Stored: " + String.join(", ", garage.getVehicleTypes()));
    }
}
