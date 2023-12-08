package org.example.exoOne.factories;

import org.example.exoOne.builders.AnimalBuilder;
import org.example.exoOne.entities.Animal;

public class JungleAnimalFactory extends AnimalFactory {

    @Override
    public Animal createAnimal(AnimalBuilder builder) {
        return builder.build();
    }
}
