package org.example.TpHouse;
public class House {
    protected long surface;
    protected Door door;

    public House(long surface) {
        this.surface = surface;
        this.door = new Door();
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

    public void setDoor(Door door) {
        this.door = door;
    }

    public void display() {
        System.out.println("Je suis une maison, ma surface est de " + surface + " m².");
        door.display();
    }
}

