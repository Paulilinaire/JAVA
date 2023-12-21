package org.example.services;

import org.example.Exception.CustomFormatException;
import org.example.dao.CustomerDAO;
import org.example.models.Customer;
import org.example.utils.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CustomerService {
    private CustomerDAO customerDAO;
    private Connection connection;

    public CustomerService() {
        connection = DatabaseManager.getConnection();
        customerDAO = new CustomerDAO(connection);
    }

    public boolean createCustomer(String firstname,String lastname, String email) throws CustomFormatException {
        Customer customer = new Customer(firstname, lastname, email);
        customer.setFirstname(firstname);
        customer.setLastname(lastname);
        customer.setEmail(email);
        try {
            return customerDAO.save(customer);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateCustomer(Customer customer){
        try {
            return customerDAO.update(customer);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Customer getCustomer(int id){
        try {
            return customerDAO.get(id);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean deleteCustomer(int id){
        Customer customer = null;
        try {
            customer = customerDAO.get(id);
            if(customer != null){
                return customerDAO.delete(customer);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public List<Customer> getAllCustomers(){
        try {
            return customerDAO.getAll();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




}
