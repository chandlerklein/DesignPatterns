package com.chandler.patterns.factory.pizzas;

import com.chandler.patterns.factory.ingredients.Cheese;
import com.chandler.patterns.factory.ingredients.Clams;
import com.chandler.patterns.factory.ingredients.Dough;
import com.chandler.patterns.factory.ingredients.Pepperoni;
import com.chandler.patterns.factory.ingredients.Sauce;
import com.chandler.patterns.factory.ingredients.Veggies;

import java.util.Arrays;

public abstract class Pizza {
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;
    String name;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clam=" + clam +
                '}';
    }
}
