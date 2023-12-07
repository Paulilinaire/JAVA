package org.example.exoOne.entities;

import org.example.exoOne.builders.AquaticAnimalBuilder;

public class AquaticAnimal extends Animal {
   private String name;
   private String species;

   public AquaticAnimal(AquaticAnimalBuilder builder){
       name = builder.getName();
       species = builder.getSpecies();
   }
}
