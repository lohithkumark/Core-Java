package Cotton;

import Material.Material;  // Importing Material class

public class Cotton extends Material {
    // Attributes of Cotton
    String origin;
    boolean isOrganic;

    public void weave() {
        System.out.println("Weaving the cotton...");
    }

    public void soften() {
        System.out.println("Softening the cotton...");
    }
}
