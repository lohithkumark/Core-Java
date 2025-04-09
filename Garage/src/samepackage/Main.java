package samepackage;

import differentpackage.GarageViewer;

public class Main {

    // Main method to drive the application
    public static void main(String[] args) {
        // Create a new Garage object
        Garage garage = new Garage();

        // Set the properties using setters
        garage.setLocation("Downtown");
        garage.setCapacity(50);
        garage.setOperational(true);
        garage.setOwner("John's Garage");
        garage.setVehicleTypes(new String[]{"Car", "Motorcycle", "Truck"});

        // Create GarageViewer and display the garage details
        GarageViewer garageViewer = new GarageViewer();
        garageViewer.displayGarageDetails(garage);

        // Print additional details
        System.out.println("\nValues in Garage:");
        System.out.println("Location: " + garage.getLocation());
        System.out.println("Capacity: " + garage.getCapacity() + " vehicles");
        System.out.println("Operational: " + (garage.isOperational() ? "Yes" : "No"));
        System.out.println("Owner: " + garage.getOwner());
        System.out.println("Vehicle Types Stored: " + String.join(", ", garage.getVehicleTypes()));
    }
}
