package com.theboreddev.vehicles;

public class Truck implements Vehicle {
    private final VehicleColor color;

    public Truck(VehicleColor color) {
        this.color = color;
    }

    public VehicleColor color() {
        return color;
    }
}
