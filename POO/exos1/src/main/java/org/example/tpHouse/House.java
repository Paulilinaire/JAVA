package org.example.tpHouse;
public class House {
    protected float surface;
    protected Door door;

    public House(float surface) {
        this.surface = surface;
        this.door = new Door("bleu");
    }

    public float getSurface() {
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

