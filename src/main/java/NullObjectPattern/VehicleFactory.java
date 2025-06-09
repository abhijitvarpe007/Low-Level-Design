package NullObjectPattern;

public class VehicleFactory {

    public static Vehicle getVehicleObject(String vehicleObj){
        switch(vehicleObj){
            case "CAR":
                return new Car();
            default:
                return new NullVechicle();
        }

    }
}
