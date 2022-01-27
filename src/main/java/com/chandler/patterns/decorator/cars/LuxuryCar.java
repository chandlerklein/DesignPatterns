package com.chandler.patterns.decorator.cars;

public class LuxuryCar extends Car {

    public LuxuryCar() {
        description = "Luxury car";
    }

    @Override
    public double cost() {
        return 70_000;
    }
}
