package org.example.dataStructure;

public class ElectricCar extends Engine implements Vehicle{
    public ElectricCar() {
        id = Engine.count;
    }

    @Override
    protected void test() {

    }

    @Override
    public void drive() {
        System.out.println("Je suis une electric car qui roule.");
    }

    @Override
    public void startEngine() {
        System.out.println("Je suis une electric car qui démarre.");
    }
}
