package org.example;


import org.example.hotel.Client;
import org.example.hotel.Hotel;
import org.example.hotel.IHM;

public class Main {
    public static void main(String[] args) {
        IHM ihm = new IHM();

        ihm.displayMessage("Quel est le nom de l'hôtel?");
        String hotelName = ihm.getUserInput();
        ihm.displayMessage("Bienvenue à l'hôtel " + hotelName);
        Hotel hotel = new Hotel(hotelName, ihm);

        boolean exitRequested = false;

        while (!exitRequested) {
            // Menu
            ihm.displayMessage("1 pour ajouter un client : ");
            ihm.displayMessage("2 pour afficher la liste des clients : ");
            ihm.displayMessage("3 pour afficher les réservations d'un client : ");
            ihm.displayMessage("4 pour ajouter une réservation : ");
            ihm.displayMessage("5 pour annuler une réservation : ");
            ihm.displayMessage("6 pour afficher la liste des réservations : ");
            ihm.displayMessage("7 pour quitter l'application");
            ihm.displayMessage("Tapez le numéro de votre choix ?");
            String userChoice = ihm.getUserInput();

            switch (userChoice) {
                case "1":
                    ihm.menu1();
                    break;
                case "2":
                    ihm.menu2();
                    break;
                case "7":
                    ihm.menu7();
                    exitRequested = true;
                    break;
                default:
                    ihm.displayMessage("Choix invalide. Veuillez réessayer.");
            }
        }

        //Menu 1
        //Adding clients
//        ihm.displayMessage("Veuillez saisir le nom du client : ");
//        String clientLastname = ihm.getUserInput();
//        ihm.displayMessage("Veuillez saisir le prénom du client : ");
//        String clientFirstname = ihm.getUserInput();
//        ihm.displayMessage("Veuillez saisir le numéro de téléphone du client : ");
//        String clientPhonenumber = ihm.getUserInput();
//
//        Client client1 = new Client(clientLastname, clientFirstname, clientPhonenumber);
//        hotel.addClient(client1);
//
//
//        ihm.displayMessage("Veuillez saisir le nom du client : ");
//        String clientLastname2 = ihm.getUserInput();
//        ihm.displayMessage("Veuillez saisir le prénom du client : ");
//        String clientFirstname2 = ihm.getUserInput();
//        ihm.displayMessage("Veuillez saisir le numéro de téléphone du client : ");
//        String clientPhonenumber2 = ihm.getUserInput();
//
//        Client client2 = new Client(clientLastname2, clientFirstname2, clientPhonenumber2);
//        hotel.addClient(client2);
//
//        //Menu 2
//        //Displaying clientList
//        ihm.displayMessage(hotel.getClientList().toString());

        //Menu3
        //Displaying client's reservation with phoneNumber

    }
}
