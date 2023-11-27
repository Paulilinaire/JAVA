package org.example.dataStructure;

public class MotorCycle extends Engine implements Vehicle{
    public MotorCycle() {
        id = Engine.count;
    }

    @Override
    protected void test() {

    }

    @Override
    public void drive() {
        System.out.println("Je suis une motorcycle qui roule.");
    }

    @Override
    public void startEngine() {
        System.out.println("Je suis une motorcycle qui démarre.");
    }
}
