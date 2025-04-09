import led.LED;  // Importing LED class

public class Main {
    public static void main(String[] args) {
        // Create an instance of LED

        LED ledLight = new LED();

        ledLight.turnOn();            // From Light class (overridden in LED)
        ledLight.adjustBrightness(1000); // From Light class (overridden in LED)
        ledLight.blink();             // From LED class// From LED class
        ledLight.turnOff();              // From Light class


    }
}
