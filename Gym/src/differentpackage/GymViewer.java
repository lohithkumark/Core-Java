package differentpackage;

import samepackage.Gym;

public class GymViewer {



    // Method to display gym details
    public void displayGymDetails(Gym gym) {
        System.out.println("Gym Name: " + gym.getName());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Number of Members: " + gym.getNumberOfMembers());
        System.out.println("Has Personal Trainers: " + (gym.hasPersonalTrainers() ? "Yes" : "No"));
        System.out.println("Facilities: " + String.join(", ", gym.getFacilities()));
    }
}
