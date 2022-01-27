package com.chandler.patterns.decorator.cars;

public class Sunroof extends CarDecorator {

    public Sunroof(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", w/ sunroof";
    }

    @Override
    public double cost() {
        return car.cost() + 3_000;
    }
}
