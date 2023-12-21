package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.Exception.CustomFormatException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class Customer {
    private int id;
    private String firstname;

    private String lastname;

    private String email;

    private List<Event> eventsList;

    public Customer(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.eventsList= new ArrayList<>();
    }

    public Customer(int id, String firstname, String lastname, String email) {
        this(firstname,lastname,email);
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) throws CustomFormatException {
        String pattern = "^([a-zA-Z0-9_.-]+)@([a-z0-9-]+\\.?[a-z0-9-]+)\\.([a-z]{2,6})$";
        if(!Pattern.matches(pattern, email)) {
            throw new CustomFormatException("Not correct email");
        }
        this.email = email;
    }

    public void setEventsTicket(List<Event> eventsTicket) {
        this.eventsList = eventsTicket;
    }

}
