package org.example.hotel;

public class Reservation {
    private long number;
    private boolean isValid = false;
    private Client client;
    private Room room;

    public Reservation(long number, boolean isValid, Client client, Room room) {
        this.number = number;
        this.isValid = isValid;
        this.client = client;
        this.room = room;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "number=" + number +
                ", isValid=" + isValid +
                ", client=" + client +
                ", room=" + room +
                '}';
    }
}
