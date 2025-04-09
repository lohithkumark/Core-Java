package differentpackage;

import samepackage.Keychain;

public class KeychainViewer {

    // Constructor
    public KeychainViewer() {
    }

    // Method to display keychain details
    public void displayKeychainDetails(Keychain keychain) {
        System.out.println("Material: " + keychain.getMaterial());
        System.out.println("Color: " + keychain.getColor());
        System.out.println("Size: " + keychain.getSize());
        System.out.println("Customizable: " + (keychain.isCustomizable() ? "Yes" : "No"));
        System.out.println("Brand: " + keychain.getBrand());  // Display brand
    }
}
