package org.example.service;

import org.example.dao.AccountDAO;
import org.example.dao.ClientDAO;
import org.example.dao.OperationDAO;
import org.example.enums.OperationStatus;
import org.example.models.Account;
import org.example.models.Client;
import org.example.models.Operation;
import org.example.utils.DatabaseManager;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BankService {
    private AccountDAO accountDAO;
    private ClientDAO clientDAO;
    private OperationDAO operationDAO;
    private Connection connection;

    public BankService(){
        try {
            connection = new DatabaseManager().getConnection();
            accountDAO = new AccountDAO(connection);
            clientDAO = new ClientDAO(connection);
            operationDAO = new OperationDAO(connection);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public Client createClient(String firstName,String lastName, String phoneNumber){
        Client client = new Client();
        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setPhoneNumber(phoneNumber);
        try {
            clientDAO.save(client);
            return client;
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean createAccount(int clientId) {
        try {
            Client client = clientDAO.get(clientId);
            if (client != null) {
                Account account = new Account(1,0.0, clientId);
                account.setClient(client);
                return accountDAO.save(account);
            } else {
                System.out.println("Aucun client trouvé avec cet ID: " + clientId);
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Account getAccount(int clientId) {
        try {
            // Retrieve the client by ID
            Client client = clientDAO.get(clientId);

            if (client != null) {
                // Retrieve the account for the client
                return accountDAO.get(clientId);
            } else {
                System.out.println("Pas de client trouvé avec l'id : " + clientId);
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deposit(double amount) {
        Account account = new Account();
        account.setBalance(amount);
        account.getOperations().add(new Operation(amount, OperationStatus.DEPOSIT));
    }




    public List<Client> getAllClients(){
        try {
            return clientDAO.getAll();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




}
