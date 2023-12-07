package org.example.classes.factory;

import org.example.classes.entity.CookingUstensil;
import org.example.classes.entity.Dish;
import org.example.classes.entity.Ingredient;

public abstract class CuisineFactory {
   public abstract Ingredient createIngredient();
   public abstract CookingUstensil createUstensil();
   public abstract Dish createDish();
}
