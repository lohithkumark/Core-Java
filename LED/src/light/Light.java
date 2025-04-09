package light;

public class Light {
    // Attributes of Light
    String color;
    int brightness; // Measured in lumens

    public void turnOn() {
        System.out.println("The light is turned on.");
    }

    public void turnOff() {
        System.out.println("The light is turned off.");
    }

    public void adjustBrightness(int level) {
        brightness = level;
        System.out.println("Brightness adjusted to " + level + " lumens.");
    }
}
