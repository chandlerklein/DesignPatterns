package com.chandler.patterns.factory;

import com.chandler.patterns.factory.ingredients.Cheese;
import com.chandler.patterns.factory.ingredients.Clams;
import com.chandler.patterns.factory.ingredients.Dough;
import com.chandler.patterns.factory.ingredients.Pepperoni;
import com.chandler.patterns.factory.ingredients.Sauce;
import com.chandler.patterns.factory.ingredients.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
