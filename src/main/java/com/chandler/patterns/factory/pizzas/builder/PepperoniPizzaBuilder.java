package com.chandler.patterns.factory.pizzas.builder;

import com.chandler.patterns.factory.PizzaIngredientFactory;
import com.chandler.patterns.factory.pizzas.PepperoniPizza;

public final class PepperoniPizzaBuilder {
    String name;
    PizzaIngredientFactory ingredientFactory;

    private PepperoniPizzaBuilder(PizzaIngredientFactory ig) {
        this.ingredientFactory = ig;
    }

    public static PepperoniPizzaBuilder aPepperoniPizza(PizzaIngredientFactory ig) {
        return new PepperoniPizzaBuilder(ig);
    }

    public PepperoniPizzaBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PepperoniPizzaBuilder withIngredientFactory(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        return this;
    }

    public PepperoniPizza build() {
        PepperoniPizza pepperoniPizza = new PepperoniPizza(ingredientFactory);
        pepperoniPizza.setName(name);
        return pepperoniPizza;
    }
}
