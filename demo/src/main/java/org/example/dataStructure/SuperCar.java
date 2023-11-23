package org.example.dataStructure;

public class SuperCar implements Vehicle{



    @Override
    public void drive() {
        System.out.println("Je suis une supercar qui roule.");
    }

    @Override
    public void startEngine() {
        System.out.println("Je suis une supercar qui démarre.");
    }
}
