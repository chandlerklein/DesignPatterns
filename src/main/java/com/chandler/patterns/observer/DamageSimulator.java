package com.chandler.patterns.observer;

public class DamageSimulator {

    public static void main(String[] args) {
        var publisher = new DamagePublisher();

        var waterDmgObserver = new WaterDamageObserver(publisher);
        var fireDmgObserver = new FireDamageObserver(publisher);
        var structuralDmgObserver = new StructuralDamageObserver(publisher);

        publisher.setDamages(
                "None",
                "Burned down barn",
                "Weakened foundation"
        );
    }
}
