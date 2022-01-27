package com.chandler.patterns.decorator.cars;

public class Spoiler extends CarDecorator {

    public Spoiler(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", w/ spoiler";
    }

    @Override
    public double cost() {
        return car.cost() + 1_500;
    }
}
