package org.example.classes.entity.impl;

import org.example.classes.entity.Ingredient;

public class JapaneseIngredient extends Ingredient {
    @Override
    public void prepare() {
        System.out.println("Please choose some good quality salmon, avocado and rice.");
    }
}
