package org.example.strategies;


import org.example.strategies.EconomicStrategy;
import org.example.strategies.NavigationSystem;
import org.example.strategies.OffRoadStrategy;
import org.example.strategies.RoadStrategy;

import java.util.Scanner;

public class Main {
        public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        NavigationSystem navigationSystem = new NavigationSystem.NavigationSystemBuilder().destination("Bora Bora").build();

        String choice;
        do {
            System.out.println("Please choose a type of navigation : ");
            System.out.println("1 -- Road Strategy");
            System.out.println("2 -- Off-Road Strategy");
            System.out.println("3 -- Economic Strategy");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    navigationSystem.goWith(new RoadStrategy());
                    break;
                case "2":
                    navigationSystem.goWith(new OffRoadStrategy());
                    break;
                case "3":
                    navigationSystem.goWith(new EconomicStrategy());
                    break;
            }
        }while (!choice.equals("0"));
    }
}