package com.theboreddev.carwash;

public class Car {
    private final WashState washState;

    public Car() {
        this.washState = WashState.INITIAL;
        System.out.println("Car state transitioned to " + washState);
    }

    public Car(WashState state) {
        System.out.println("Car state transitioned to " + state);
        this.washState = state;
    }

    public WashState washState() {
        return washState;
    }
}
