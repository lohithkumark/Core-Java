package led;

import light.Light;  // Importing Light class

public class LED extends Light {
    // Attributes of LED
    String type; // For example, "bulb", "strip", "panel"
    boolean isEnergyEfficient;

    public void blink() {
        System.out.println("The LED is blinking.");
    }
    }

