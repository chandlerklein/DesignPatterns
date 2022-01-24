package com.chandler.patterns.observer;

public class WaterDamageObserver implements Observer, DamageDisplay {

    private final DamagePublisher publisher;
    private String waterInfo;

    public WaterDamageObserver(DamagePublisher publisher) {
        this.publisher = publisher;
        publisher.addObserver(this);
    }

    @Override
    public void update() {
        this.waterInfo = publisher.getWaterDamage();
        display();
    }

    @Override
    public void display() {
        System.out.println("WATER OBSERVER >> info: " + waterInfo);
    }
}
