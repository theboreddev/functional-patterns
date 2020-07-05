package com.theboreddev.vehicles;

public class Bus implements Vehicle {
    private final VehicleColor color;

    public Bus(VehicleColor color) {
        this.color = color;
    }

    public VehicleColor color() {
        return color;
    }
}
