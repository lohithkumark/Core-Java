package internal;

import external.Vehicle;
import external.Car;
import external.Truck;

public class Mains {
    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle();
        myVehicle.startEngine();
        myVehicle.displayWheels();

        System.out.println("------------");


        Vehicle myCar = new Car();
        myCar.startEngine();
        myCar.displayWheels();


        System.out.println("-----------");

        Vehicle myTruck = new Truck();
        myTruck.startEngine();
        myTruck.displayWheels();

}
}
