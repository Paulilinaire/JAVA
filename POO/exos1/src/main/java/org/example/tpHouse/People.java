package org.example.tpHouse;
public class People {
    protected String name;
    protected House house;

    public People(String name, House house) {

        this.name = name;
        this.house = house;
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
        house.door.display();
    }
}
