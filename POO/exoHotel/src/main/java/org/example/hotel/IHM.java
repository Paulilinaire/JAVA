package org.example.hotel;

import java.util.Scanner;

public class IHM {
    private final Scanner scanner;

    public IHM() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public String getUserInput() {
        System.out.print("Enter a value: ");
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        IHM ihm = new IHM();

        ihm.displayMessage("Welcome to this application!");
        String userInput = ihm.getUserInput();
        ihm.displayMessage("You entered: " + userInput);
    }
}
