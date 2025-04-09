import Omlette.Omlette;  // Importing Omlet class

public class Main {
    public static void main(String[] args) {
        // Create an instance of Omlette
        Omlette omlette = new Omlette();
        omlette.serve();        // From Dish class
        omlette.accompany();    // From SideDish class
        omlette.cook();         // From Omlette class
    }
}
