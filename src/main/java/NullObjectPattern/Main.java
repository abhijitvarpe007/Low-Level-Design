package NullObjectPattern;

import javax.lang.model.element.VariableElement;

public class Main {

    public static void main(String[] args){

        Vehicle car = VehicleFactory.getVehicleObject("CAR");
        printVehicleDetails(car);

        Vehicle bike = VehicleFactory.getVehicleObject("Bike");
        printVehicleDetails(bike);
    }

    public static void printVehicleDetails(Vehicle vehicle){
        System.out.println("Vehicle Tank Capacity : " + vehicle.getTankCapacity());
        System.out.println("Vehicle Seating Capacity : " + vehicle.getSeattingCapacity());
    }
}
