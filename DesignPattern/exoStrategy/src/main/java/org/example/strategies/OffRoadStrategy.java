package org.example.strategies;

import java.util.Random;

public class OffRoadStrategy implements NavigationStrategy{

    Random random = new Random();
    @Override
    public boolean navigate(String destination) {
        System.out.println("Off-Road Strategy navigation to destination : " + destination);
        return random.nextBoolean();
    }
}
