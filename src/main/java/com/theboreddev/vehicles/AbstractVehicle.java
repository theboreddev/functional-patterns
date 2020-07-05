package com.theboreddev.vehicles;

public abstract class AbstractVehicle implements Vehicle {

    public void start() {
        preStartCheck();
        System.out.println(String.format("%s starting...", this.getClass().getSimpleName()));
    }

    protected abstract void preStartCheck();
}
