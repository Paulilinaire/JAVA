package org.example.exoOne.entities;

import org.example.exoOne.builders.JungleAnimalBuilder;

public class JungleAnimal extends Animal {
    private String name;
    private String species;
    public JungleAnimal(JungleAnimalBuilder builder){
        name = builder.getName();
        species = builder.getSpecies();
    }

    @Override
    public String toString() {
        return "JungleAnimal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
