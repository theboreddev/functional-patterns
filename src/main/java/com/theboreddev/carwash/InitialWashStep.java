package com.theboreddev.carwash;

public class InitialWashStep extends CarWashStep {

    @Override
    public Car applyTo(Car car) {
        final Car newCar = new Car(WashState.INITIAL_WASH);
        if (nextStep != null) {
            return nextStep.applyTo(newCar);
        }
        return newCar;
    }
}
