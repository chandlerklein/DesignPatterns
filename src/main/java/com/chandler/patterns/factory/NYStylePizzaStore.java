package com.chandler.patterns.factory;

import com.chandler.patterns.factory.pizzas.Pizza;

import static com.chandler.patterns.factory.pizzas.builder.CheesePizzaBuilder.aCheesePizza;
import static com.chandler.patterns.factory.pizzas.builder.ClamPizzaBuilder.aClamPizza;
import static com.chandler.patterns.factory.pizzas.builder.PepperoniPizzaBuilder.aPepperoniPizza;
import static com.chandler.patterns.factory.pizzas.builder.VeggiePizzaBuilder.aVeggiePizza;

public class NYStylePizzaStore implements PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        PizzaIngredientFactory ig = new NYPizzaIngredientFactory();
        return switch (type) {
            case "cheese" -> aCheesePizza(ig).withName("New York Style Cheese Pizza").build();
            case "veggie" -> aVeggiePizza(ig).withName("New York Style Veggie Pizza").build();
            case "clam" -> aClamPizza(ig).withName("New York Style Clam Pizza").build();
            case "pepperoni" -> aPepperoniPizza(ig).withName("New York Style Pepperoni Pizza").build();
            default -> null;
        };
    }

}
