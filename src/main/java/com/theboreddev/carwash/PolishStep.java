package com.theboreddev.carwash;

public class PolishStep extends CarWashStep {
    @Override
    Car applyTo(Car car) {
        final Car newCar = new Car(WashState.POLISHED);
        if (nextStep != null) {
            return nextStep.applyTo(newCar);
        }
        return newCar;
    }
}
