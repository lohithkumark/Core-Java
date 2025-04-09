package samepackage;

public class Tank {

    // Instance variables
    private String model;
    private int capacity;  // in liters
    private double enginePower;  // in horsepower
    private boolean isArmored;
    private String countryOfOrigin;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }


    public boolean isArmored() {
        return isArmored;
    }

    public void setArmored(boolean isArmored) {
        this.isArmored = isArmored;
    }


    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}
