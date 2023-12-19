package org.example.dao;

import org.example.models.Account;
import org.example.models.Client;

import java.sql.*;

public class ClientDAO extends BaseDAO<Client> {
    private Connection connection;

    public ClientDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Client element) throws SQLException {
        request = "INSERT INTO client (first_name, last_name, phone_number) VALUES (?, ?, ?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getFirstName());
        statement.setString(2, element.getLastName());
        statement.setString(3, element.getPhoneNumber());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1;
    }
    

    @Override
    public Client get(int id) throws SQLException {
        return null;
    }

    public Client getClientById(int clientId) throws SQLException {
        Client client = null;
        String request = "SELECT * FROM client WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(request)) {
            statement.setInt(1, clientId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");
                    client = new Client(id, firstName, lastName);
                }
            }
        }
        return client;
    }
}
