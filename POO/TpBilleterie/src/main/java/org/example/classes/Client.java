package org.example.classes;

import lombok.Data;
import lombok.Getter;
import org.example.exceptions.CustomFormatException;
import org.example.exceptions.TicketSaleException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.regex.Pattern;

@Data
public class Client {
    private static int counter = 1;

    private int id;
    private String lastname;
    private String firstname;
    private String email;
    private ArrayList<Event> boughtTickets = new ArrayList<>();

    @Getter
    public ArrayList<Client> allClients = new ArrayList<>();

    public Client(String lastname, String firstname, String email) {
        this.id = counter++;
        this.lastname = lastname;
        this.firstname = firstname;
        setEmail(email);
    }

    private Client findClient(int id) {
        for (Client client : allClients) {
            if (client.getId() == id) {
                return client;
            }
        }
        return null;
    }

    public  void setEmail(String lastname) throws CustomFormatException{
        String pattern = "^([a-zA-Z0-9_.-]+)@([a-z0-9-]+\\.?[a-z0-9-]+)\\.([a-z]{2,6})$";
        //REGEX: [] un bloc, "+" pr concaténer un autre bloc pouvant contenir des minuscules et majuscules de a à z, des chiffres, un point et un tiret, {2,6} = de 2 à 6 caractères
        //verificateur regex: https://regexr.com/
        if(Pattern.matches(pattern, email)){
            throw  new CustomFormatException("email incorrecte");
        }
        this.email = email;
    }

    public boolean addClient(String lastname, String firstname, String email) {
        Client newClient= new Client(lastname, firstname, email);
        return allClients.add(newClient);
    }

    public boolean deleteClient(int id){
        Client client = findClient(id);
        if(client!= null){
            return allClients.remove(client);
        }
        return false;
    }

    public boolean changeCLient(String newLastname, String newFirstname, String newEmail) throws CustomFormatException {
        Client client = findClient(id);
        if (client != null) {
            client.setLastname(newLastname);
            client.setFirstname(newFirstname);
            client.setEmail(newEmail);
            return true;
        }
        return false;
    }

    public void buyTicket(Event event){
        try {
            event.sellTicket();
            boughtTickets.add(event);
            System.out.println("Ticket acheté avec succés !");
        } catch (TicketSaleException e){
            System.out.println("L'achat du billet a echoué : " + e.getMessage());
        }
    }

    public void cancelTicket(Event event){
        try {
            event.cancelTicket();
            boughtTickets.remove(event);
            System.out.println("Ticket acheté avec succés !");
        } catch (TicketSaleException e){
            System.out.println("L'annulation du billet a echoué : " + e.getMessage());
        }
    }
}
