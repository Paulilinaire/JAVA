package org.example.hotel;

import java.util.Scanner;

public class IHM {
    private Scanner scanner;

    public IHM() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public String getUserInput() {
        System.out.print("Entrer votre réponse: ");
        return scanner.nextLine();
    }

    @Override
    public String toString() {
        return "IHM{" +
                "scanner=" + scanner +
                '}';
    }
}
