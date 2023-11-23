package org.example.dataStructure;

public class PetrolCar extends Engine implements Vehicle {

    public PetrolCar() {
        id = Engine.count;
    }

    @Override
    public void drive() {
        System.out.println("Je suis une petrol car qui roule.");
    }

    @Override
    public void startEngine() {
        System.out.println("Je suis une petrol car qui démarre.");
    }

    @Override
    protected void test() {

    }

    @Override
    public String toString() {
        return "PetrolCar{" +
                "id=" + id +
                ", wheelNb=" + wheelNb +
                ", color='" + color + '\'' +
                '}';
    }
}
