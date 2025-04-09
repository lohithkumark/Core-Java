package samepackage;

import differentpackage.KeychainViewer;

public class Main {

    // Main method to drive the application
    public static void main(String[] args) {
        // Create a new Keychain object
        Keychain keychain = new Keychain();

        // Set the properties using setters
        keychain.setMaterial("Leather");
        keychain.setColor("Brown");
        keychain.setSize("Medium");
        keychain.setCustomizable(true);
        keychain.setBrand("KeyCo");

        // Create KeychainViewer and display the keychain details
        KeychainViewer keychainViewer = new KeychainViewer();
        keychainViewer.displayKeychainDetails(keychain);

        // Print additional details
        System.out.println("\nValues in Keychain:");
        System.out.println("Material: " + keychain.getMaterial());
        System.out.println("Color: " + keychain.getColor());
        System.out.println("Size: " + keychain.getSize());
        System.out.println("Customizable: " + (keychain.isCustomizable() ? "Yes" : "No"));
        System.out.println("Brand: " + keychain.getBrand());
    }
}
