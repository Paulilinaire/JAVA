package org.example.classes;

import org.example.enums.ReservationStatus;
import org.example.enums.RoomStatus;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class IHMConsole {
    private static Scanner scanner = new Scanner(System.in);
    private static Hotel hotel;
    public static void start(){
        System.out.println("Bonjour ! Quel est le nom de l'hôtel ?");
        String hotelName = scanner.nextLine();

        hotel = new Hotel(hotelName);

        initializateHotel(hotelName);
        menu();

    }

    public static void  initializateHotel(String hotelName){
        hotel = new Hotel(hotelName, new Room[]{
                new Room(130,4),
                new Room(130,4),
                new Room(130,4),
                new Room(130,4),
                new Room(130,4),
                new Room(130,4),
                new Room(130,4),
                new Room(130,4)
        });
    };

    public static void menu(){
        String choices[] = {
           "1- Ajouter un client",
           "2- Afficher la liste des clients",
           "3- Afficher les réservations d'un client",
           "4- Ajouter une réservation",
           "5- Annuler une réservation",
           "6- Afficher la liste des réservations",
           "0- Quitter"
        };
        System.out.println("Bienvenue à l'hôtel : "+ hotel.getName());
        for (String c: choices){
            System.out.println(c); // pour chaque choix, je l'affiche dans la console
        }

//        int choice = scanner.nextInt();
        int choice = parseInt(scanner.next()); // si le User ne tape pas un numéro, le parseInt convertit

        switch (choice){ // fonction récursive car c'est une fonction qui en appelle une autre
            case 1 -> {
                addClient();
                menu();
            }
            case 2 -> {
                displayClient();
                menu();
            }
            case 3 -> {
                displayReservationByClient();
                menu();
            }
            case 4 -> {
                addReservation();
                menu();
            }
            case 5 -> {
                cancelReservation();
                menu();
            }
            case 6 -> {
                displayAllReservations();
                menu();
            }
            case 0 -> {
                break; // pour quitter, le User sort de la boucle
            }
            default -> {
                System.out.println("Oups, choix invalide !");
            }
        }

    }

    private static void addClient(){
        System.out.println("Ajout d'un client");
        System.out.println("Nom du client :");
        String clientLastName = scanner.next();
        System.out.println("Prénom du client :");
        String clientFirstName = scanner.next();
        System.out.println("Téléphone du client :");
        String clientPhoneNumber = scanner.next();

        if(hotel.addClient(clientLastName, clientFirstName, clientPhoneNumber)){
            System.out.println("Client ajouté"); // true
        }else {
            System.out.println("ERREUR !"); // false
        }
    }

    private static void displayClient(){
        System.out.println("Affichage infos client");
        for (Client c: hotel.getClients()) {
            if(c != null){System.out.println(c);
            }

        }

    }

    private static void displayReservationByClient(){
        System.out.println("Affichage reservation client");
        System.out.println("Quelle est l'id du client ?");
        int idClient = parseInt(scanner.next());
        for (Reservation r: hotel.getReservations()) {
            if(r != null){
                if(r.getClient().getId() == idClient){
                    System.out.println(r);
                }
            }
        }

    }

    private static void addReservation(){
        System.out.println("Ajout d'une reservation");
        displayClient();
        System.out.println("Quelle est l'id du client ?");
        int idClient = parseInt(scanner.next());
        System.out.println("Quelle est le numéro de chambre ?");
        int idRoom = parseInt(scanner.next());
        if(hotel.getRoomingList()[idRoom-1].getStatus() == RoomStatus.FREE){ // condition pour pouvoir réserver une chambre libre
            Reservation reservation = new Reservation(hotel.getClients()[idClient-1], hotel.getRoomingList()[idRoom-1], ReservationStatus.CONFIRMED); // -1 car ++count donc le client n°1 est à l'index du tableau n°0
            hotel.getRoomingList()[idRoom-1].setStatus(RoomStatus.OCCUPIED); // on change le statut de la chambre à "occupé"
            hotel.addReservation(reservation);
            System.out.println("Réservation confirmée");
        }else {
            System.out.println("Chambre indisponible");
        }
    }

    private static void cancelReservation(){
        System.out.println("Annulation d'une réservation");
        System.out.println("Quelle est l'id de la réservation ?");
        int idReservation = parseInt(scanner.next());
        Reservation reservation = hotel.getReservations()[idReservation-1]; // on récupére la résa
        Room room = reservation.getRoom();
        room.setStatus(RoomStatus.FREE); // changer le statut de la chambre
        reservation.setStatus(ReservationStatus.CANCELED); // change le statut de la résa

    }

    private static void displayAllReservations() {
        System.out.println("Affichage de toutes les réservations");
        for (Reservation r : hotel.getReservations()) {
            if (r != null) {
                System.out.println(r);
            }

        }
    }
}
