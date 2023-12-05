package org.example;


import org.example.classes.factory.impl.ItalianCuisineFactory;
import org.example.classes.factory.impl.JapaneseCuisineFactory;

public class Main {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        restaurant.cook(new ItalianCuisineFactory());
        restaurant.serve(new ItalianCuisineFactory());
        System.out.println();
        restaurant.cook(new JapaneseCuisineFactory());
        restaurant.serve(new JapaneseCuisineFactory());

    }
}