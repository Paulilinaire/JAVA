package org.example.exoOne.entities;

import org.example.exoOne.builders.SafariAnimalBuilder;

public class SafariAnimal extends Animal {
    private String name;
    private String species;

    public SafariAnimal(SafariAnimalBuilder builder){
        name = builder.getName();
        species = builder.getSpecies();
    }

    @Override
    public String toString() {
        return "SafariAnimal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
