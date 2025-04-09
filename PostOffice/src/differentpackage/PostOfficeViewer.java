package differentpackage;

import samepackage.PostOffice;

public class PostOfficeViewer {

    // Constructor
    public PostOfficeViewer() {
    }

    // Method to display post office details
    public void displayPostOfficeDetails(PostOffice postOffice) {
        System.out.println("Post Office Name: " + postOffice.getName());
        System.out.println("Location: " + postOffice.getLocation());
        System.out.println("Number of Employees: " + postOffice.getNumOfEmployees());
        System.out.println("Operational: " + (postOffice.isOperational() ? "Yes" : "No"));
        System.out.println("Opening Hours: " + postOffice.getOpeningHours());
    }
}
