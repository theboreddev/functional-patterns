package com.theboreddev.carwash;

public class SoapStep extends CarWashStep {

    @Override
    public Car applyTo(Car car) {
        final Car newCar = new Car(WashState.SOAP);
        if (nextStep != null) {
            return nextStep.applyTo(newCar);
        }
        return newCar;
    }
}
