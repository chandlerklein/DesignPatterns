package com.chandler.patterns.observer;

import java.util.ArrayList;
import java.util.List;

import static com.chandler.patterns.observer.DamagePublisherBuilder.damagePublisher;

public class DamagePublisher implements Subject {
    private final List<Observer> observers;
    private String waterDamage;
    private String fireDamage;
    private String structuralDamage;

    public DamagePublisher() {
        this.observers = new ArrayList<>();
        damagePublisher()
                .fireDamage("12345")
                .structuralDamage("345")
                .build();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public void setDamages(String waterDamage, String fireDamage, String structuralDamage) {
        this.waterDamage = waterDamage;
        this.fireDamage = fireDamage;
        this.structuralDamage = structuralDamage;
        notifyObservers();
    }

    public String getWaterDamage() {
        return waterDamage;
    }

    public String getFireDamage() {
        return fireDamage;
    }

    public String getStructuralDamage() {
        return structuralDamage;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setWaterDamage(String waterDamage) {
        this.waterDamage = waterDamage;
    }

    public void setFireDamage(String fireDamage) {
        this.fireDamage = fireDamage;
    }

    public void setStructuralDamage(String structuralDamage) {
        this.structuralDamage = structuralDamage;
    }
}
