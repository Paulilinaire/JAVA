package org.example;

import org.example.exoOne.Observable.Visitor;
import org.example.exoOne.builders.AquaticAnimalBuilder;
import org.example.exoOne.builders.JungleAnimalBuilder;
import org.example.exoOne.entities.Animal;
import org.example.exoOne.entities.Zoo;
import org.example.exoOne.factories.AquaticAnimalFactory;
import org.example.exoOne.factories.JungleAnimalFactory;
import org.example.exoOne.factories.SafariAnimalFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //Create a unique zoo
        Zoo zoo = Zoo.getInstance();

        //Create and register visitors
        Visitor visitor1 = new Visitor("Thomas");
        Visitor visitor2 = new Visitor("Amélie");

        zoo.registerObserver(visitor1);
        zoo.registerObserver(visitor2);

        //Create animals
        AquaticAnimalFactory aquaticAnimalFactory = new AquaticAnimalFactory();
        JungleAnimalFactory jungleAnimalFactory = new JungleAnimalFactory();
        SafariAnimalFactory safariAnimalFactory = new SafariAnimalFactory();

        Animal doplhin = aquaticAnimalFactory.createAnimal(new AquaticAnimalBuilder()
                .name("Flipper")
                .species("dolphin")
        );


        Animal gorilla = jungleAnimalFactory.createAnimal(new JungleAnimalBuilder()
                .name("Gozilla")
        );

        //Notify visitors of new animal
        zoo.notifyObservers("Dear customer, a new animal arrived: " + doplhin);
        zoo.notifyObservers("Dear customer, a new animal arrived: " + gorilla);


        //Thomas unsuscribe
        zoo.removeObserver(visitor1);

        //Simulate special event, only Amelie received notification
        zoo.notifyObservers("Special Event !!");


    }
}