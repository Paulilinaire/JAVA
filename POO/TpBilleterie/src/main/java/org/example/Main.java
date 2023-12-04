package org.example;


import org.example.classes.Client;
import org.example.classes.Event;
import org.example.classes.Place;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Create a Place with scanner
        System.out.println("Enter place details:");
        System.out.print("Name: ");
        String placeName = scanner.nextLine();
        System.out.print("Address: ");
        String placeAddress = scanner.nextLine();
        System.out.print("Capacity: ");
        int placeCapacity = scanner.nextInt();
        scanner.nextLine();
        Place place = new Place(placeName, placeAddress, placeCapacity);


        // Create an Event with scanner
        System.out.println("\nEnter event details:");
        System.out.print("Name: ");
        String eventName = scanner.nextLine();
        System.out.print("Date (yyyy-MM-dd): ");
        String eventDateStr = scanner.nextLine();
        LocalDate eventDate = LocalDate.parse(eventDateStr);
        System.out.print("Hour (HH:mm): ");
        String eventHourStr = scanner.nextLine();
        LocalTime eventHour = LocalTime.parse(eventHourStr);
        System.out.print("Price: ");
        double eventPrice = scanner.nextDouble();
        scanner.nextLine();
        Event event = new Event(eventName, eventDate, eventHour, eventPrice);


        // Create a Client with scanner
        System.out.println("\nEnter client details:");
        System.out.print("Lastname: ");
        String clientLastname = scanner.nextLine();
        System.out.print("Firstname: ");
        String clientFirstname = scanner.nextLine();
        System.out.print("Email: ");
        String clientEmail = scanner.nextLine();
        Client client = new Client(clientLastname, clientFirstname, clientEmail);

        // Display information
        System.out.println("\nPlace created: " + place);
        System.out.println("\nEvent created: " + event);
        System.out.println("\nClient created: " + client);




    }
}