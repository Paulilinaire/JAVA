package org.example.classes.factory.impl;

import org.example.classes.entity.CookingUstensil;
import org.example.classes.factory.CuisineFactory;
import org.example.classes.entity.Dish;
import org.example.classes.entity.Ingredient;
import org.example.classes.entity.impl.ItalianCookingUstensil;
import org.example.classes.entity.impl.ItalianDish;
import org.example.classes.entity.impl.ItalianIngredient;


public class ItalianCuisineFactory extends CuisineFactory {

    @Override
    public Ingredient createIngredient() {
        return new ItalianIngredient();
    }

    @Override
    public CookingUstensil createUstensil() {
        return new ItalianCookingUstensil();
    }

    @Override
    public Dish createDish() {
        return new ItalianDish();
    }
}
