package samepackage;

import differentpackage.JetViewer;

public class Main {

    // Main method to drive the application
    public static void main(String[] args) {
        // Create a new Jet object
        Jet jet = new Jet();


        jet.setModel("F-22 Raptor");
        jet.setMaxSpeed(2410);  // 2410 km/h
        jet.setRange(2960);     // 2960 km
        jet.setStealth(true);
        jet.setManufacturer("Lockheed Martin");


        JetViewer jetViewer = new JetViewer();
        jetViewer.displayJetDetails(jet);


        System.out.println("\nValues in Jet:");
        System.out.println("Model: " + jet.getModel());
        System.out.println("Max Speed: " + jet.getMaxSpeed() + " km/h");
        System.out.println("Range: " + jet.getRange() + " km");
        System.out.println("Stealth Capabilities: " + (jet.isStealth() ? "Yes" : "No"));
        System.out.println("Manufacturer: " + jet.getManufacturer());
    }
}

