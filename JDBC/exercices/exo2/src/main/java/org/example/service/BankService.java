package org.example.service;

import org.example.dao.AccountDAO;
import org.example.dao.ClientDAO;
import org.example.models.Client;
import org.example.utils.DatabaseManager;


import java.sql.Connection;
import java.sql.SQLException;

public class BankService {
    private AccountDAO accountDAO;
    private ClientDAO clientDAO;
    private Connection connection;

    public BankService(){
        try {
            connection = new DatabaseManager().getConnection();
            accountDAO = new AccountDAO(connection);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public boolean createClient(String firstName,String lastName, String login, String phoneNumber){
        Client client = new Client();
        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setPhoneNumber(phoneNumber);
        try {
            return clientDAO.save(client);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
