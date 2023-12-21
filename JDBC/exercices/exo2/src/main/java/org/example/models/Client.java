package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private String login;
    private String phoneNumber;
    private List<Account> accounts = new ArrayList<>();

    public Client(int id, String firstName, String lastName, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.lastName = lastName;
    }

    public Client() {
    }
}
