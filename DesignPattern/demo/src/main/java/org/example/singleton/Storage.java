package org.example.singleton;

import org.example.builder.Car;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    // The field for storing the singleton instance should be
    // declared static.
    private static volatile Storage instance = null;
    private List<Car> carList = new ArrayList<>();

    // The singleton's constructor should always be private to
    // prevent direct construction calls with the `new`
    // operator.
    private Storage(){
        carList = new ArrayList<>();
    }

    // The static method that controls access to the singleton
    // instance.
    public static Storage getInstance(){
        if(instance == null){
            synchronized (Storage.class) { // lock usage of the instance when instance is already used by someone else //MANDATORY
                instance = new Storage();
            }
        }
        return instance;
    }

    public List<Car> getCarList() {
        return carList = new ArrayList<>();
    }
}
