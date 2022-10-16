package com.chandler.patterns.observer;

public final class DamagePublisherBuilder {
    private String waterDamage;
    private String fireDamage;
    private String structuralDamage;

    private DamagePublisherBuilder() {}

    public static DamagePublisherBuilder damagePublisher() {return new DamagePublisherBuilder();}

    public DamagePublisherBuilder waterDamage(String waterDamage) {
        this.waterDamage = waterDamage;
        return this;
    }

    public DamagePublisherBuilder fireDamage(String fireDamage) {
        this.fireDamage = fireDamage;
        return this;
    }

    public DamagePublisherBuilder structuralDamage(String structuralDamage) {
        this.structuralDamage = structuralDamage;
        return this;
    }

    public DamagePublisher build() {
        DamagePublisher damagePublisher = new DamagePublisher();
        damagePublisher.setWaterDamage(waterDamage);
        damagePublisher.setFireDamage(fireDamage);
        damagePublisher.setStructuralDamage(structuralDamage);
        return damagePublisher;
    }
}
