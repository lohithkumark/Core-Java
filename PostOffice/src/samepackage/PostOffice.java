package samepackage;

public class PostOffice {

    // Instance variables
    private String name;
    private String location;
    private int numOfEmployees;
    private boolean isOperational;
    private String openingHours;


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


    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }


    public boolean isOperational() {
        return isOperational;
    }

    public void setOperational(boolean isOperational) {
        this.isOperational = isOperational;
    }


    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }
}
