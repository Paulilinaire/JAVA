package org.example.classes;

import org.example.enums.RoomStatus;

public class Room {

    private static int counter = 100;
    private int number;
    private double price;
    private int capacity;
    private RoomStatus status; // boolean possible car seulement 2 possibilités, mais enum pour révision

    public Room(double price, int capacity) {
        this.number = ++counter;
        this.status = RoomStatus.FREE;
        this.price = price;
        this.capacity = capacity;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Room.counter = counter;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room:" +
                "number=" + number +
                ", price=" + price +
                ", capacity=" + capacity +
                ", status=" + status +
                '.';
    }
}
