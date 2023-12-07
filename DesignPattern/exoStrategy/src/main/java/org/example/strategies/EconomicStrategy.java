package org.example.strategies;

import java.util.Random;

public class EconomicStrategy implements NavigationStrategy{
    Random random = new Random();
    @Override
    public boolean navigate(String destination) {
        System.out.println("Economic Strategy navigation to destination : " + destination);
        return random.nextBoolean();
    }
}
