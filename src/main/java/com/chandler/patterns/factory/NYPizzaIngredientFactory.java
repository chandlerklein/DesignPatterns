package com.chandler.patterns.factory;

import com.chandler.patterns.factory.ingredients.Cheese;
import com.chandler.patterns.factory.ingredients.Clams;
import com.chandler.patterns.factory.ingredients.Dough;
import com.chandler.patterns.factory.ingredients.FreshClams;
import com.chandler.patterns.factory.ingredients.Garlic;
import com.chandler.patterns.factory.ingredients.MarinaraSauce;
import com.chandler.patterns.factory.ingredients.Mushroom;
import com.chandler.patterns.factory.ingredients.Onion;
import com.chandler.patterns.factory.ingredients.Pepperoni;
import com.chandler.patterns.factory.ingredients.RedPepper;
import com.chandler.patterns.factory.ingredients.ReggianoCheese;
import com.chandler.patterns.factory.ingredients.Sauce;
import com.chandler.patterns.factory.ingredients.SlicedPepperoni;
import com.chandler.patterns.factory.ingredients.ThinCrustDough;
import com.chandler.patterns.factory.ingredients.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
