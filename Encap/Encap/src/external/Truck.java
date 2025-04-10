package external;

public class Truck extends Vehicle {
    @Override
    public void displayWheels() {
        System.out.println("This truck has 18 wheels.");
    }

    public void loadCargo() {
        System.out.println("Truck is loading cargo.");
    }
}
