package samepackage;

public class Keychain {

    // Instance variables
    private String material;
    private String color;
    private String size;
    private boolean isCustomizable;
    private String brand;


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    public boolean isCustomizable() {
        return isCustomizable;
    }

    public void setCustomizable(boolean isCustomizable) {
        this.isCustomizable = isCustomizable;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
