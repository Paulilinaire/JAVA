package org.example.exoOne.entities;

import org.example.exoOne.builders.AquaticAnimalBuilder;
import org.example.exoOne.builders.JungleAnimalBuilder;
import org.example.exoOne.builders.SafariAnimalBuilder;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private static volatile Zoo instance = null;
    private static final Object lock = new Object();
    private List<AquaticAnimalBuilder> acquaticAnimalList;
    private List<SafariAnimalBuilder> safariAnimalList;
    private List<JungleAnimalBuilder> jungleAnimalList;
    private String name;

    public List<AquaticAnimalBuilder> getAcquaticAnimalList() {return acquaticAnimalList;}
    public List<SafariAnimalBuilder> getSafariAnimalList() {return safariAnimalList;}

    public List<JungleAnimalBuilder> getJungleAnimalList() {
        return jungleAnimalList;
    }

    private Zoo(){
        acquaticAnimalList = new ArrayList<>();
        safariAnimalList = new ArrayList<>();
        jungleAnimalList = new ArrayList<>();
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
                "acquaticAnimalList=" + acquaticAnimalList +
                ", safariAnimalList=" + safariAnimalList +
                ", jungleAnimalList=" + jungleAnimalList +
                ", name='" + name ;
    }
}
