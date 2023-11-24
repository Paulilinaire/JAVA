package org.example.hotel;

public class Room {
    private long number;
    private Boolean isOccupied = false;
    private double price;
    private int capacity;

    public Room(long number, Boolean isOccupied, double price, int capacity) {
        this.number = number;
        this.isOccupied = isOccupied;
        this.price = price;
        this.capacity = capacity;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Boolean getOccupied() {
        return isOccupied;
    }

    public void setOccupied(Boolean occupied) {
        isOccupied = occupied;
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

    @Override
    public String toString() {
        return "Room{" +
                "number=" + number +
                ", isOccupied=" + isOccupied +
                ", price=" + price +
                ", capacity=" + capacity +
                '}';
    }
}