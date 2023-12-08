package org.example.exoOne.factories;

import org.example.exoOne.builders.AnimalBuilder;
import org.example.exoOne.entities.Animal;

public abstract class AnimalFactory {
    public abstract Animal createAnimal(AnimalBuilder builder);
}
