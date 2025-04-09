package Plant;

import Thing.Thing;  // Importing Thing class

public class Plant extends Thing {
    // Attributes of Plant
    String species;
    boolean isFlowering;

    public void grow() {
        System.out.println("The plant is growing...");
    }

    public void photosynthesize() {
        System.out.println("The plant is photosynthesizing...");
    }
}
