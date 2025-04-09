package samepackage;

public class Gym {

    // Instance variables
    private String name;
    private String location;
    private int numberOfMembers;
    private boolean hasPersonalTrainers;
    private String[] facilities;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }


    public boolean hasPersonalTrainers() {
        return hasPersonalTrainers;
    }

    public void setHasPersonalTrainers(boolean hasPersonalTrainers) {
        this.hasPersonalTrainers = hasPersonalTrainers;
    }


    public String[] getFacilities() {
        return facilities;
    }

    public void setFacilities(String[] facilities) {
        this.facilities = facilities;
    }
}
