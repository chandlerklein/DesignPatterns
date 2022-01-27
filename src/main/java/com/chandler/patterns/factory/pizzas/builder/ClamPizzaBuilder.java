package com.chandler.patterns.factory.pizzas.builder;

import com.chandler.patterns.factory.PizzaIngredientFactory;
import com.chandler.patterns.factory.pizzas.ClamPizza;

public final class ClamPizzaBuilder {
    String name;
    PizzaIngredientFactory ingredientFactory;

    private ClamPizzaBuilder(PizzaIngredientFactory ig) {
        this.ingredientFactory = ig;
    }

    public static ClamPizzaBuilder aClamPizza(PizzaIngredientFactory ig) {
        return new ClamPizzaBuilder(ig);
    }

    public ClamPizzaBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ClamPizzaBuilder withIngredientFactory(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        return this;
    }

    public ClamPizza build() {
        ClamPizza clamPizza = new ClamPizza(ingredientFactory);
        clamPizza.setName(name);
        return clamPizza;
    }
}
