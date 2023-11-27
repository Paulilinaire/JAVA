package org.example.hotel;

import java.util.List;
import java.util.Scanner;

public class IHM {
    private Scanner scanner;
    private Client client;
    private Hotel hotel;

    private List<Client> clientList;

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

    public void menu1() {
        System.out.print("Veuillez saisir le nom du client : ");
        String clientLastname = scanner.nextLine();
        System.out.print("Veuillez saisir le prénom du client : ");
        String clientFirstname = scanner.nextLine();
        System.out.print("Veuillez saisir le numéro de téléphone du client : ");
        String clientPhonenumber = scanner.nextLine();
        Client client = new Client(clientLastname, clientFirstname, clientPhonenumber);
        hotel.addClient(client);
    }

    public void menu2() {
        hotel.clientListDisplay();
    }

    public void menu7(){
        scanner.close();
    }

    @Override
    public String toString() {
        return "IHM{" +
                "scanner=" + scanner +
                '}';
    }
}
