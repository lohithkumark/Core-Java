package external;

public class Car extends Vehicle {
    @Override
    public void displayWheels() {
        System.out.println("This car has 4 wheels.");
    }

    public void honk() {
        System.out.println("Car honks: Beep Beep!");
    }
}