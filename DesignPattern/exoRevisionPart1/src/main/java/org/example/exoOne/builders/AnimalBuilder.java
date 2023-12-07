package org.example.exoOne.builders;

import org.example.exoOne.entities.Animal;

public abstract class AnimalBuilder {
    public abstract AnimalBuilder name(String name);
    public abstract AnimalBuilder species (String species);

    public abstract Animal build();
}
