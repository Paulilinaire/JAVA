package org.example.classes.factory.impl;

import org.example.classes.entity.CookingUstensil;
import org.example.classes.factory.CuisineFactory;
import org.example.classes.entity.Ingredient;
import org.example.classes.entity.Dish;
import org.example.classes.entity.impl.JapaneseCookingUstensil;
import org.example.classes.entity.impl.JapaneseDish;
import org.example.classes.entity.impl.JapaneseIngredient;

public class JapaneseCuisineFactory extends CuisineFactory {

    @Override
    public Ingredient createIngredient() {
        return new JapaneseIngredient();
    }
    @Override
    public CookingUstensil createUstensil() {
        return new JapaneseCookingUstensil();
    }

    @Override
    public Dish createDish() {
        return new JapaneseDish();
    }

}
