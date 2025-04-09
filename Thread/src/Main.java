import Thread.Thread;  // Importing Thread class

public class Main {
    public static void main(String[] args) {
        // Create an instance of Thread
        Thread thread = new Thread();


        // Call methods from the hierarchy
        thread.create();            // From Material class
        thread.displayInfo();       // From Material class
        thread.weave();             // From Cotton class
        thread.soften();            // From Cotton class
        thread.spin();              // From Thread class
        thread.dye();               // From Thread class

        
    }
}
