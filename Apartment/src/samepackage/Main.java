package samepackage;

import differentpackage.ApartmentViewer;

public class Main {

    // Main method to drive the application
    public static void main(String[] args) {
        // Create a new Apartment object
        Apartment apartment = new Apartment();

        // Set the properties using setters
        apartment.setAddress("123 Elm Street, Apt 4B");
        apartment.setFloorNumber(4);
        apartment.setHasBalcony(true);
        apartment.setRentAmount(1200.50);
        apartment.setNumberOfRooms(3);

        // Create ApartmentViewer and display the apartment details
        ApartmentViewer apartmentViewer = new ApartmentViewer();
        apartmentViewer.displayApartmentDetails(apartment);

        // Print additional details
        System.out.println("\nValues in Apartment:");
        System.out.println("Address: " + apartment.getAddress());
        System.out.println("Floor Number: " + apartment.getFloorNumber());
        System.out.println("Has Balcony: " + (apartment.hasBalcony() ? "Yes" : "No"));
        System.out.println("Rent Amount: $" + apartment.getRentAmount());
        System.out.println("Number of Rooms: " + apartment.getNumberOfRooms());
    }
}
