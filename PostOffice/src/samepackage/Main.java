package samepackage;

import differentpackage.PostOfficeViewer;

public class Main {

    // Main method to drive the application
    public static void main(String[] args) {
        // Create a new PostOffice object
        PostOffice postOffice = new PostOffice();

        // Set the properties using setters
        postOffice.setName("Central Post Office");
        postOffice.setLocation("Downtown City");
        postOffice.setNumOfEmployees(50);
        postOffice.setOperational(true);
        postOffice.setOpeningHours("9 AM - 5 PM");

        // Create PostOfficeViewer and display the post office details
        PostOfficeViewer postOfficeViewer = new PostOfficeViewer();
        postOfficeViewer.displayPostOfficeDetails(postOffice);

        // Print additional details
        System.out.println("\nValues in Post Office:");
        System.out.println("Post Office Name: " + postOffice.getName());
        System.out.println("Location: " + postOffice.getLocation());
        System.out.println("Number of Employees: " + postOffice.getNumOfEmployees());
        System.out.println("Operational: " + (postOffice.isOperational() ? "Yes" : "No"));
        System.out.println("Opening Hours: " + postOffice.getOpeningHours());
    }
}
