package org.example;

import org.example.exos.MessageType;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner (System.in);

    public static void main(String[] args) {

//        //demo
//        Priority priority = Priority.HIGH;
//
//        switch (priority){
//            case HIGH:
//                System.out.println("High Priority");
//                break;
//            case MEDIUM:
//                System.out.println("Medium Priority");
//                break;
//            case LOW:
//                System.out.println("Low Priority");
//                break;
//        }
//
//        Priority priority1 = Priority.valueOf("HIGH");
//
//        Priority[] values = Priority.values();
//
//        for (Priority p: values) {
//            System.out.println("enum : "+ p);
//        }

        //exo

        MessageType messageType;
        do {
            System.out.println("Enter the letter (A, B, C, or D): ");
            String input = scanner.next();
            messageType = MessageType.fromString(input);

            if (messageType == null) {
                System.out.println("Invalid letter. Please enter a valid type.");
            }
        } while (messageType == null);

        System.out.println("Priority: " + messageType.getPriority());

        scanner.close();

    }
}