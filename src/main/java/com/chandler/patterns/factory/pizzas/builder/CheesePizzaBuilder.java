package com.chandler.patterns.factory.pizzas.builder;

import com.chandler.patterns.factory.PizzaIngredientFactory;
import com.chandler.patterns.factory.pizzas.CheesePizza;

public final class CheesePizzaBuilder {
    String name;
    PizzaIngredientFactory ingredientFactory;

    private CheesePizzaBuilder(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public static CheesePizzaBuilder aCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        return new CheesePizzaBuilder(pizzaIngredientFactory);
    }

    public CheesePizzaBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public CheesePizzaBuilder withIngredientFactory(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        return this;
    }

    public CheesePizza build() {
        CheesePizza cheesePizza = new CheesePizza(ingredientFactory);
        cheesePizza.setName(name);
        return cheesePizza;
    }
}
