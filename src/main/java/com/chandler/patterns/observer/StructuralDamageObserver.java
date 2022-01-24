package com.chandler.patterns.observer;

public class StructuralDamageObserver implements Observer, DamageDisplay {

    private final DamagePublisher publisher;
    private String structureInfo;

    public StructuralDamageObserver(DamagePublisher publisher) {
        this.publisher = publisher;
        publisher.addObserver(this);
    }

    @Override
    public void update() {
        this.structureInfo = publisher.getStructuralDamage();
        display();
    }

    @Override
    public void display() {
        System.out.println("STRUCT OBSERVER >> info: " + structureInfo);
    }
}
