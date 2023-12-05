package org.example;


import org.example.abstractFactory.Application;
import org.example.abstractFactory.MacFactory;
import org.example.abstractFactory.WindowsFactory;
import org.example.builder.Car;
import org.example.singleton.Storage;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Builder
        Car car = new Car.Builder()
                .brand("tesla")
                .model("3")
                .build();
        System.out.println(car);
        car = new Car.Builder().brand("ferrari")
                .build();
        System.out.println(car);


        //Abstract Factory
        Application macApp = new Application(new MacFactory());
        Application windowsApp = new Application(new WindowsFactory());

        //Singleton
        List<Car> liste = Storage.getInstance().getCarList();


    }
}