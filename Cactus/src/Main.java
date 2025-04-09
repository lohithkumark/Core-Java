import Cactus.Cactus;  // Importing Cactus class

public class Main {
    public static void main(String[] args) {
        // Create an instance of Cactus

Cactus cactus = new Cactus();
        // Call methods from the hierarchy
        cactus.exist();            // From Thing class
        cactus.displayInfo();      // From Thing class
        cactus.grow();             // From Plant class
        cactus.photosynthesize();  // From Plant class
        cactus.storeWater();       // From Cactus class
        cactus.surviveInDesert();  // From Cactus class


    }
}
