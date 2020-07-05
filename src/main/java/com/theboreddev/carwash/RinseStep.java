package com.theboreddev.carwash;

public class RinseStep extends CarWashStep {
    @Override
    Car applyTo(Car car) {
        final Car newCar = new Car(WashState.RINSED);
        if (nextStep != null) {
            return nextStep.applyTo(newCar);
        }
        return newCar;
    }
}
