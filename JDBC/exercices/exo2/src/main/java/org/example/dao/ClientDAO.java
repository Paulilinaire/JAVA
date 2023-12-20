package org.example.dao;

import org.example.models.Client;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClientDAO extends BaseDAO<Client> {
    public ClientDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Client element) throws SQLException {
        String request = "INSERT INTO client (first_name, last_name, phone_number) VALUES (?, ?, ?)";
        try (PreparedStatement statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, element.getFirstName());
            statement.setString(2, element.getLastName());
            statement.setString(3, element.getPhoneNumber());
            int nbRows = statement.executeUpdate();
            try (ResultSet resultSet = statement.getGeneratedKeys()) {
                if (resultSet.next()) {
                    element.setId(resultSet.getInt(1));
                }
            }
            return nbRows == 1;
        }
    }

    @Override
    public List<Client> getAll() throws SQLException {
        List<Client> result = new ArrayList<>();
        String request = "SELECT * FROM client";
        try (PreparedStatement statement = _connection.prepareStatement(request);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Client client = new Client(
                        resultSet.getInt("id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("last_name"),
                        resultSet.getString("phone_number")
                );
                result.add(client);
            }
        }
        return result;
    }

    @Override
    public Client get(int id) throws SQLException {
        Client client = null;
        String request = "SELECT * FROM client WHERE id = ?";
        try (PreparedStatement statement = _connection.prepareStatement(request)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    client = new Client(
                            resultSet.getInt("id"),
                            resultSet.getString("first_name"),
                            resultSet.getString("last_name"),
                            resultSet.getString("phone_number")
                    );
                }
            }
        }
        return client;
    }

}
