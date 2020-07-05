package com.theboreddev.carwash;

public class RinseStep extends CarWashStep {
    @Override
    Car applyTo(Car car) {
        final Car newCar = car.updateState(WashState.RINSED);
        if (nextStep != null) {
            return nextStep.applyTo(newCar);
        }
        return newCar;
    }
}
