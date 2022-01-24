package com.chandler.patterns.observer;

public class FireDamageObserver implements Observer, DamageDisplay {

    private final DamagePublisher publisher;
    private String fireInfo;

    public FireDamageObserver(DamagePublisher publisher) {
        this.publisher = publisher;
        publisher.addObserver(this);
    }

    @Override
    public void update() {
        this.fireInfo = publisher.getFireDamage();
        display();
    }

    @Override
    public void display() {
        System.out.println("FIRE OBSERVER >> info: " + fireInfo);
    }

}
