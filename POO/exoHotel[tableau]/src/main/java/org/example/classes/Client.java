package org.example.classes;

public class Client {

    private static int counter = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Client(String firstName, String lastName, String phoneNumber) {
        this.id = ++counter; // pour que le 1er client n'est pas de id n°0
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Client.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override // une réécriture d'une méthode héritée, nécessaire pour afficher les infos dans la console
    public String toString() {
        return "Client :" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '.';
    }

}
