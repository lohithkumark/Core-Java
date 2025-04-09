import Revolver.Revolver;  // Importing Revolver class

public class Main {
    public static void main(String[] args) {
        // Create an instance of Revolver
        Revolver revolver = new Revolver();
        // Call methods from the hierarchy
        revolver.use();           // From Tool class
        revolver.maintain();      // From Tool class
        revolver.aim();           // From Weapon class
        revolver.shoot();         // From Weapon class
        revolver.reload();        // From Revolver class
        revolver.spinCylinder();  // From Revolver class

    }
}
