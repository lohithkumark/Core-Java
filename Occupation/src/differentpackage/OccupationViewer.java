package differentpackage;

import samepackage.Occupation;

public class OccupationViewer {

    // Constructor
    public OccupationViewer() {
    }

    // Method to display occupation details
    public void displayOccupationDetails(Occupation occupation) {
        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Company: " + occupation.getCompany());
        System.out.println("Years of Experience: " + occupation.getYearsOfExperience());
        System.out.println("Is Employed: " + (occupation.isEmployed() ? "Yes" : "No"));
    }
}
