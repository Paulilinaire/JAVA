package org.example;


import org.example.hotel.Client;
import org.example.hotel.Hotel;
import org.example.hotel.IHM;

public class Main {
    public static void main(String[] args) {

        IHM ihm = new IHM();

        ihm.displayMessage("Quel est le nom de l'hôtel?");
        String hotelName = ihm.getUserInput();
        ihm.displayMessage("Bienvenu à l'hôtel " + hotelName);
        Hotel hotel = new Hotel(hotelName, ihm);

        //Menu 1
        //Adding clients
        ihm.displayMessage("Veuillez saisir le nom du client : ");
        String clientLastname = ihm.getUserInput();
        ihm.displayMessage("Veuillez saisir le prénom du client : ");
        String clientFirstname = ihm.getUserInput();
        ihm.displayMessage("Veuillez saisir le numéro de téléphone du client : ");
        String clientPhonenumber = ihm.getUserInput();

        Client client1 = new Client(clientLastname, clientFirstname, clientPhonenumber);
        hotel.addClient(client1);


        ihm.displayMessage("Veuillez saisir le nom du client : ");
        String clientLastname2 = ihm.getUserInput();
        ihm.displayMessage("Veuillez saisir le prénom du client : ");
        String clientFirstname2 = ihm.getUserInput();
        ihm.displayMessage("Veuillez saisir le numéro de téléphone du client : ");
        String clientPhonenumber2 = ihm.getUserInput();

        Client client2 = new Client(clientLastname2, clientFirstname2, clientPhonenumber2);
        hotel.addClient(client2);

        //Menu 2
        //Displaying clientList
        ihm.displayMessage(hotel.getClientList().toString());

        //Menu3
        //Displaying client's reservation with phoneNumber

    }
}