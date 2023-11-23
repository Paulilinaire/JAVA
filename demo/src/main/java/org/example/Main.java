package org.example;

import org.example.dataStructure.*;

public class Main {
    public static void main(String[] args) {

        ElectricCar electricCar = new ElectricCar();
        electricCar.setColor("bleu");
        electricCar.setWheelNb(5);

        MotorCycle motorCycle = new MotorCycle();
        motorCycle.setColor("rouge");
        motorCycle.setWheelNb(2);

        PetrolCar petrolCar = new PetrolCar();
        petrolCar.setColor("yellow");
        petrolCar.setWheelNb(4);

        SuperCar superCar = new SuperCar(); // n'hérite pas d'Engine

        Engine[] engines = {electricCar, motorCycle, petrolCar};
        for (Engine engine: engines) {
            moveVehicle(engine);
        }
        Vehicle[] vehicles = {electricCar, motorCycle, petrolCar, superCar};
    }

    public static void moveVehicle(Engine engine){
        if(engine instanceof ElectricCar){ // instanceof appelle tous les electricCars
            System.out.println("électrique");
            ((ElectricCar) engine).drive();
        } else if (engine instanceof MotorCycle) {
            System.out.println("moto");
            ((MotorCycle) engine).drive();
        } else if (engine instanceof PetrolCar) {
            System.out.println("petrol car");
            ((PetrolCar) engine).drive();
        }

        }

    }
}