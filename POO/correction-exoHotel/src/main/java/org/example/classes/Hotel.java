package org.example.classes;


import java.util.Arrays;

public class Hotel {

    private String name;
    private Room[] roomingList;
    private Reservation[] reservations;
    private Client[] clients;
    private int clientCounter = 0;
    private int reservationCounter = 0;

    public Hotel(String name, Room[] roomingList) {
        this.name = name;
        this.roomingList = roomingList;
        this.reservations = new Reservation[100]; // en Java doit être déclaré une seule fois avec une taille bien précise
        this.clients = new Client[100];
    }

    public Hotel(String name, Room[] roomingList, Reservation[] reservations, Client[] clients) {
        this.name = name;
        this.roomingList = roomingList;
        this.reservations = reservations;
        this.clients = clients;
    }

    public Hotel(String hotelName) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room[] getRoomingList() {
        return roomingList;
    }

    public void setRoomingList(Room[] roomingList) {
        this.roomingList = roomingList;
    }

    public Reservation[] getReservations() {
        return reservations;
    }

    public void setReservations(Reservation[] reservations) {
        this.reservations = reservations;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    //Ajouter un client
    public boolean addClient(String firstName, String lastName, String phoneNumber){
        Client client = new Client(firstName, lastName, phoneNumber);
        if (clientCounter < 100){
            clients[clientCounter++] = client;
            return true;
        }else return false;
    }

    //Ajouter une réservation
    public boolean addReservation(Reservation reservation){
        if (clientCounter < 100){
            reservations[reservationCounter++] = reservation;
            return true;
        }else return false;
    }



    @Override
    public String toString() {
        return "Hotel: " +
                "name='" + name + '\'' +
                ", roomingList=" + Arrays.toString(roomingList) +
                ", reservations=" + Arrays.toString(reservations) +
                ", clients=" + Arrays.toString(clients) +
                '.';
    }
}
