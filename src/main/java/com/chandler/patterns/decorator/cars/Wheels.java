package com.chandler.patterns.decorator.cars;

public class Wheels extends CarDecorator {

    public Wheels(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", w/ better wheels";
    }

    @Override
    public double cost() {
        return car.cost() + 500;
    }
}
