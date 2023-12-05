package org.example;

import org.example.classes.entity.CookingUstensil;
import org.example.classes.factory.CuisineFactory;
import org.example.classes.entity.Dish;
import org.example.classes.entity.Ingredient;

public class Restaurant {

    private Dish dish;
    private Ingredient ingredient;
    private CookingUstensil cookingUstensil;

    private CuisineFactory cuisineFactory;

    public void cook(CuisineFactory cuisine ){
        ingredient = cuisine.createIngredient();
        cookingUstensil = cuisine.createUstensil();
        cookingUstensil.use();
        ingredient.prepare();
    }

    public void serve(CuisineFactory cuisine){
        dish = cuisine.createDish();
        dish.serve();
    }



}
