package samepackage;

import differentpackage.GymViewer;

public class Main {

    // Main method to drive the application
    public static void main(String[] args) {
        // Create a new Gym object
        Gym gym = new Gym();

        // Set the properties using setters
        gym.setName("FitZone");
        gym.setLocation("Downtown Area");
        gym.setNumberOfMembers(1200);
        gym.setHasPersonalTrainers(true);
        gym.setFacilities(new String[]{"Cardio Equipment", "Swimming Pool", "Free Weights", "Yoga Classes"});

        // Create GymViewer and display the gym details
        GymViewer gymViewer = new GymViewer();
        gymViewer.displayGymDetails(gym);

        // Print additional details
        System.out.println("\nValues in Gym:");
        System.out.println("Gym Name: " + gym.getName());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Number of Members: " + gym.getNumberOfMembers());
        System.out.println("Has Personal Trainers: " + (gym.hasPersonalTrainers() ? "Yes" : "No"));
        System.out.println("Facilities: " + String.join(", ", gym.getFacilities()));
    }
}
