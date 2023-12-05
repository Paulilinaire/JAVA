package org.example.classes.entity.impl;

import org.example.classes.entity.Dish;

public class JapaneseDish extends Dish {
    @Override
    public void serve() {
        System.out.println("Sushis are served !");
    }
}
