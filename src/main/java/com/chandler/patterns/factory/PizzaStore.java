package com.chandler.patterns.factory;

import com.chandler.patterns.factory.pizzas.Pizza;

public interface PizzaStore {

    default Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();

        pizza.bake();

        pizza.cut();

        pizza.box();

        return pizza;
    }

    Pizza createPizza(String type);
}
