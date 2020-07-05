package com.theboreddev.carwash;

public class DryStep extends CarWashStep {
    @Override
    Car applyTo(Car car) {
        final Car newCar = car.updateState(WashState.DRIED);
        if (nextStep != null) {
            return nextStep.applyTo(newCar);
        }
        return newCar;
    }
}
