package samepackage;

import differentpackage.OccupationViewer;

public class Main {

    // Main method to drive the application
    public static void main(String[] args) {
        // Create a new Occupation object using setters
        Occupation occupation = new Occupation();
        occupation.setTitle("Software Engineer");
        occupation.setCompany("Tech Corp");
        occupation.setYearsOfExperience(5);
        occupation.setEmployed(true);

        // Create OccupationViewer and display the occupation details
        OccupationViewer occupationViewer = new OccupationViewer();
        occupationViewer.displayOccupationDetails(occupation);

        // Print additional details
        System.out.println("\nValues in Occupation:");
        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Company: " + occupation.getCompany());
        System.out.println("Years of Experience: " + occupation.getYearsOfExperience());
        System.out.println("Is Employed: " + (occupation.isEmployed() ? "Yes" : "No"));
    }
}
