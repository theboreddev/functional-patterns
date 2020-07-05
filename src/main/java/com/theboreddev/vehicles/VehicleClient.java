package com.theboreddev.vehicles;

public class VehicleClient {

    public static void main(String[] args) {
        final Vehicle redCar = VehicleType.CAR.factory.apply(VehicleColor.RED);
        final Vehicle redCar2 = OldStyleVehicleFactory.instanceOfType(VehicleType.CAR, VehicleColor.RED);

        final Vehicle blackTruck = VehicleType.TRUCK.factory.apply(VehicleColor.BLACK);

        final Vehicle blueBus = VehicleType.BUS.factory.apply(VehicleColor.BLUE);
        blueBus.start(nil -> {
            System.out.println("Check if every new passenger has paid for their tickets");
            System.out.println("Check if every passenger is seated");
        });
    }

}
