package org.example.hotel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hotel {

    private String name;
    private Room[] roomingList;
    private List<Reservation> reservationList;
    private List<Client> clientList;
    public IHM ihm;

    public Hotel(String name, IHM ihm) {
        this.name = name;
        this.ihm = ihm;
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

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public void clientListDisplay() {
        if (clientList != null) {
            ihm.displayMessage("Liste des clients de l'hôtel " + name + ":");
            for (Client client : clientList) {
                if (client != null) {
                    ihm.displayMessage("ID: " + client.getId() +
                            ", nom: " + client.getLastName() +
                            ", prénom: " + client.getFirstName() +
                            ", téléphone: " + client.getPhoneNumber());
                }
            }
        } else {
            ihm.displayMessage("Erreur ! Il n'y a pas de client.");
        }
    }

    public void addClient(Client client) {
        clientList = (clientList == null) ? new ArrayList<>() : clientList; // if (clientList == null ) { clientList = new ArrayList<>();
        clientList.add(client);
        ihm.displayMessage("Client ajouté à la liste : " + client.getFirstName() + " " + client.getLastName());
    }


    /*public void roomingListDisplay() {
        if (roomingList != null) {
            ihm.displayMessage("Rooming List for " + name + ":");
            for (Room room : roomingList) {
                if (room != null) {
                    ihm.displayMessage(room.toString());
                }
            }
        } else {
            ihm.displayMessage("Rooming List is not initialized.");
        }
    }*/

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", roomingList=" + Arrays.toString(roomingList) +
                ", reservationList=" + reservationList +
                ", clientList=" + clientList +
                '}';
    }
}
