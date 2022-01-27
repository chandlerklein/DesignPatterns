package com.chandler.patterns.decorator.cars;

public class CarRunner {

    public static void main(String[] args) {
        Car car = new CheapCar();
        System.out.println(car.getDescription() + " $" + car.cost());

        Car car2 = new LuxuryCar();
        car2 = new Spoiler(car2);
        car2 = new Sunroof(car2);
        car2 = new Wheels(car2);
        System.out.println(car2.getDescription() + ": $" + car2.cost());
    }
}
