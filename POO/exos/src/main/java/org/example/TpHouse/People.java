package org.example.TpHouse;
public class People {
    private String name;
    private House house;

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public void display() {
        System.out.println("Nom de la personne : " + name);
        System.out.println("Données de la maison : ");
        house.display();
    }
}
