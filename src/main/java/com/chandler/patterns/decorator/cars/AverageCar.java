package com.chandler.patterns.decorator.cars;

public class AverageCar extends Car {

    public AverageCar() {
        description = "Average car";
    }

    @Override
    public double cost() {
        return 15_000;
    }
}
