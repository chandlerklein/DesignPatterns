package com.chandler.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class DamagePublisher implements Subject {

    private final List<Observer> observers;
    private String waterDamage;
    private String fireDamage;
    private String structuralDamage;

    public DamagePublisher() {
        this.observers = new ArrayList<>();
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
}
