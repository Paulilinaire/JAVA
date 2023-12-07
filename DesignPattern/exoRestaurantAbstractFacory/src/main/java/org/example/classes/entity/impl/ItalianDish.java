package org.example.classes.entity.impl;

import org.example.classes.entity.Dish;

public class ItalianDish extends Dish {
    @Override
    public void serve() {
        System.out.println("Here's your pizza !");
    }
}
