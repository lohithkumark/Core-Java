package samepackage;

public class Jet {

    // Instance variables
    private String model;
    private double maxSpeed;  // in km/h
    private double range;     // in kilometers
    private boolean isStealth;
    private String manufacturer;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }


    public boolean isStealth() {
        return isStealth;
    }

    public void setStealth(boolean isStealth) {
        this.isStealth = isStealth;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
