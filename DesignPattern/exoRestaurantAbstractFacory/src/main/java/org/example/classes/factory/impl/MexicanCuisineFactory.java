package org.example.classes.factory.impl;

import org.example.classes.entity.CookingUstensil;
import org.example.classes.factory.CuisineFactory;
import org.example.classes.entity.Dish;
import org.example.classes.entity.Ingredient;
import org.example.classes.entity.impl.MexicanCookingUstensil;
import org.example.classes.entity.impl.MexicanDish;
import org.example.classes.entity.impl.MexicanIngredient;

public class MexicanCuisineFactory extends CuisineFactory {


    @Override
    public Ingredient createIngredient() {
        return new MexicanIngredient();
    }

    @Override
    public CookingUstensil createUstensil() {
        return new MexicanCookingUstensil();
    }

    @Override
    public Dish createDish() {
        return new MexicanDish();
    }
}
