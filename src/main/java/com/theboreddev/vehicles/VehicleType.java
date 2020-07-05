package com.theboreddev.vehicles;

import java.util.function.Function;

public enum VehicleType {
    BUS(Bus::new),
    TRUCK(Truck::new),
    CAR(Car::new);

    public final Function<VehicleColor, Vehicle> factory;

    VehicleType(Function<VehicleColor, Vehicle> factory) {
        this.factory = factory;
    }
}

