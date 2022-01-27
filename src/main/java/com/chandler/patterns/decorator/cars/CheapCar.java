package com.chandler.patterns.decorator.cars;

public class CheapCar extends Car {

    public CheapCar() {
        description = "Cheap car";
    }

    @Override
    public double cost() {
        return 5_000;
    }
}
