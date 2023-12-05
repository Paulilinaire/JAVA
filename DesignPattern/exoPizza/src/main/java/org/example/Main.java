package org.example;


import org.example.classes.Pizza;
import org.example.enums.Cheese;
import org.example.enums.PastryType;
import org.example.enums.Size;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
                .size(Size.MEDIUM)
                .pastryType(PastryType.THIN)
                .cheese(Cheese.MOZZARELLA)
                .ingredients(List.of("ham", "mushrooms"))
                .sauce("tomato")
                .build();
        System.out.println(pizza);

        Pizza pizza1 = new Pizza.Builder()
                .size(Size.SMALL)
                .pastryType(PastryType.CLASSIC)
                .sauce("tomato")
                .build();
    }
}