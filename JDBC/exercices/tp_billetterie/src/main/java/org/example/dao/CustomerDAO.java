package org.example.dao;

import org.example.models.Customer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO extends BaseDAO<Customer> {
    public CustomerDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Customer element) throws SQLException {
        request = "INSERT INTO customer (first_name,last_name,email) VALUES (?,?,?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1,element.getFirstname());
        statement.setString(2,element.getLastname());
        statement.setString(3,element.getEmail());
        int nbRow = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRow == 1;
    }

    @Override
    public boolean update(Customer element) throws SQLException {
        request = "UPDATE customer SET first_name = ?, last_name = ? WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setString(1, element.getFirstname());
        statement.setString(2, element.getLastname());
        statement.setString(3, element.getEmail());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public boolean delete(Customer element) throws SQLException {
        request = "DELETE FROM customer WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1,element.getId());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public Customer get(int id) throws SQLException {
        Customer customer = null;
        request = "SELECT * FROM customer WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1,id);
        resultSet = statement.executeQuery();
        if(resultSet.next()){
            customer = new Customer(resultSet.getInt("id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("email"));

        }
        return customer;
    }

    @Override
    public List<Customer> getAll() throws SQLException {
        List<Customer> customers = new ArrayList<>();
        request = "SELECT * FROM customer";
        statement = _connection.prepareStatement(request);
        resultSet = statement.executeQuery();
        while(resultSet.next()){
            Customer customer = new Customer(resultSet.getInt("id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("email"));
            customers.add(customer);
        }
        return customers;
    }
}
