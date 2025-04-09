package differentpackage;

import samepackage.Apartment;

public class ApartmentViewer {

    // Constructor
    public ApartmentViewer() {
    }

    // Method to display apartment details
    public void displayApartmentDetails(Apartment apartment) {
        System.out.println("Address: " + apartment.getAddress());
        System.out.println("Floor Number: " + apartment.getFloorNumber());
        System.out.println("Has Balcony: " + (apartment.hasBalcony() ? "Yes" : "No"));
        System.out.println("Rent Amount: $" + apartment.getRentAmount());
        System.out.println("Number of Rooms: " + apartment.getNumberOfRooms());
    }
}
