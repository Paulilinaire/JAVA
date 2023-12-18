package org.example.exoOne.builders;

import org.example.exoOne.entities.Animal;
import org.example.exoOne.entities.JungleAnimal;

public class JungleAnimalBuilder extends AnimalBuilder {
    private String name;
    private String species;

    @Override
    public AnimalBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public AnimalBuilder species(String species) {
        this.species = species;
        return this;
    }

    @Override
    public Animal build() {
        return new JungleAnimal(this);
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }


}
