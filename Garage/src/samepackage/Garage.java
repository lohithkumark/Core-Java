package samepackage;

public class Garage {

    // Instance variables
    private String location;
    private int capacity;  // Maximum number of vehicles it can hold
    private boolean isOperational;
    private String owner;
    private String[] vehicleTypes;  // Types of vehicles stored in the garage (e.g., cars, bikes)


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public boolean isOperational() {
        return isOperational;
    }

    public void setOperational(boolean isOperational) {
        this.isOperational = isOperational;
    }


    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    public String[] getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(String[] vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }
}
