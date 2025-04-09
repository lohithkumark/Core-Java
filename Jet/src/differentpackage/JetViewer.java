package differentpackage;

import samepackage.Jet;

public class JetViewer {

    public void displayJetDetails(Jet jet) {
        System.out.println("Model: " + jet.getModel());
        System.out.println("Max Speed: " + jet.getMaxSpeed() + " km/h");
        System.out.println("Range: " + jet.getRange() + " km");
        System.out.println("Stealth Capabilities: " + (jet.isStealth() ? "Yes" : "No"));
        System.out.println("Manufacturer: " + jet.getManufacturer());
    }
}
