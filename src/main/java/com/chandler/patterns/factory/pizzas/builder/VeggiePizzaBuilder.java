package com.chandler.patterns.factory.pizzas.builder;

import com.chandler.patterns.factory.PizzaIngredientFactory;
import com.chandler.patterns.factory.pizzas.VeggiePizza;

public final class VeggiePizzaBuilder {
    String name;
    PizzaIngredientFactory ingredientFactory;

    private VeggiePizzaBuilder(PizzaIngredientFactory ig) {
        this.ingredientFactory = ig;
    }

    public static VeggiePizzaBuilder aVeggiePizza(PizzaIngredientFactory ig) {
        return new VeggiePizzaBuilder(ig);
    }

    public VeggiePizzaBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public VeggiePizzaBuilder withIngredientFactory(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        return this;
    }

    public VeggiePizza build() {
        VeggiePizza veggiePizza = new VeggiePizza(ingredientFactory);
        veggiePizza.setName(name);
        return veggiePizza;
    }
}
