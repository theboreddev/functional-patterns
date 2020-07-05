package com.theboreddev.carwash;

public class Car {
    private WashState washState;

    public Car() {
        this.washState = WashState.INITIAL;
        System.out.println("Car state transitioned to " + washState);
    }

    public Car updateState(WashState state) {
        System.out.println("Car state transitioned to " + state);
        this.washState = state;
        return this;
    }

    public WashState washState() {
        return washState;
    }
}
