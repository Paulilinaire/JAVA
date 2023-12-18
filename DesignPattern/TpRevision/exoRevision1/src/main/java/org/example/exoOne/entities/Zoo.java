package org.example.exoOne.entities;

import org.example.exoOne.Observable.VisitorObserver;
import org.example.exoOne.Observable.ZooObservable;
import org.example.exoOne.builders.AquaticAnimalBuilder;
import org.example.exoOne.builders.JungleAnimalBuilder;
import org.example.exoOne.builders.SafariAnimalBuilder;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements ZooObservable<String> {
    private static volatile Zoo instance = null;
    private static final Object lock = new Object();
    private List<VisitorObserver<String>> observers = new ArrayList<>();
    private String name;

    private Zoo(){
    }

    public static Zoo getInstance() {
        if(instance == null){
            synchronized (lock){
                instance = new Zoo();
            }
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Zoo: " +
                ", name='" + name ;
    }


    @Override
    public void registerObserver(VisitorObserver<String> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(VisitorObserver<String> observer) {
        observers.remove(observer);
    }


    @Override
    public void notifyObservers(String event) {
        observers.forEach(o -> {
            o.update(event);
        });
    }
}
