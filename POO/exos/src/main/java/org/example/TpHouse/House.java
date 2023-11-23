package org.example.TpHouse;
public class House {
    private long surface;
    private Door door;

    public House(long surface) {
        this.surface = surface;
        this.door = new Door("blue"); // Default color is blue
    }

    public long getSurface() {
        return surface;
    }

    public void setSurface(long surface) {
        this.surface = surface;
    }

    public Door getDoor() {
        return door;
    }

    public void display() {
        System.out.println("Je suis une maison, ma surface est de " + surface + " m².");
        door.display();
    }
}

