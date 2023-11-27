package org.example.classes;

import org.example.enums.ReservationStatus;

public class Reservation {

    private static int counter = 1380;
    private int number;
    private Client client;
    private Room room;
    private ReservationStatus status;

    public Reservation(Client client, Room room, ReservationStatus status) {
        this.number = ++counter;
        this.client = client;
        this.room = room;
        this.status = status;
    }


    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Reservation: " +
                "number=" + number +
                ", client=" + client +
                ", room=" + room +
                ", status=" + status +
                '.';
    }
}
