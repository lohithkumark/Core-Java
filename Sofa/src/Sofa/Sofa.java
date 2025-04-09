package Sofa;

import Furniture.Furniture;  // Importing Furniture class

public class Sofa extends Furniture {
    // Attributes of Sofa
    int seats;
    boolean hasRecliner;

    public void recline() {
        if (hasRecliner) {
            System.out.println("Reclining the sofa.");
        } else {
            System.out.println("This sofa doesn't have a recliner.");
        }
    }
}
