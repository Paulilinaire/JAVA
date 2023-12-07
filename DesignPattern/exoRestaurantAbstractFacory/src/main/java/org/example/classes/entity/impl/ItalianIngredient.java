package org.example.classes.entity.impl;

import org.example.classes.entity.Ingredient;

public class ItalianIngredient extends Ingredient {
    @Override
    public void prepare() {
        System.out.println("Some tomato, mozzarella and ham for the ingredients. And it's ready!");
    }
}
