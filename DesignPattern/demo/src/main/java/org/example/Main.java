package org.example;


import org.example.demoBuilder.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .brand("tesla")
                .model("3")
                .build();
        System.out.println(car);
        car = new Car.Builder().brand("ferrari")
                .build();
        System.out.println(car);
    }
}