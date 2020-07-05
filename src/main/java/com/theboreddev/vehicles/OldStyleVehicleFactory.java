package com.theboreddev.vehicles;

public class OldStyleVehicleFactory {
    /*
    Issues:
        1 - if conditions to check type leads to duplication most of the times
        2 - Adding a new type of vehicle implies adding a new conditional
        3 - We have to throw IllegalArgumentException if there's no match for type
        4 - Harder to read
     */

    public static Vehicle instanceOfType(VehicleType type,
                                         VehicleColor color) {
        if (type.equals(VehicleType.CAR)) {
            return new Car(color);
        } else if (type.equals(VehicleType.BUS)) {
            return new Bus(color);
        } else if (type.equals(VehicleType.TRUCK)) {
            return new Truck(color);
        }
        throw new IllegalArgumentException("No support for type " + type);
    }
}
