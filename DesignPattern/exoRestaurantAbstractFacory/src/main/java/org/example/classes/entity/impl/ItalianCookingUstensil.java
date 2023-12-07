package org.example.classes.entity.impl;

import org.example.classes.entity.CookingUstensil;

public class ItalianCookingUstensil extends CookingUstensil {
    @Override
    public void use() {
        System.out.println("We need a good oven and a pizza spatula.");
    }
}
