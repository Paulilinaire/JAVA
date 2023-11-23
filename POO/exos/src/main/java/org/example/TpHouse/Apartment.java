package org.example.TpHouse;

public class Apartment extends House {
    public Apartment() {
        super(50);
    }

    public void display(){
        System.out.println("Je suis un appartement, ma surface est de " + surface + " m².");
    }
}
