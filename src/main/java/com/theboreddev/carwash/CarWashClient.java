package com.theboreddev.carwash;

import java.util.function.Function;

public class CarWashClient {

    public static void main(String[] args) {

        final Car car = new Car();
        Function<Car, Car> initial = c -> new Car(WashState.INITIAL);

        final Function<Car, Car> chain = initial
                .andThen(c1 -> new Car(WashState.INITIAL_WASH))
                .andThen(c2 -> new Car(WashState.SOAP))
                .andThen(c3 -> new Car(WashState.RINSED))
                .andThen(c4 -> new Car(WashState.POLISHED))
                .andThen(c5 -> new Car(WashState.DRIED));

        final Car finalCar = chain.apply(car);

        System.out.println("Final car state is " + finalCar.washState());
    }
}
