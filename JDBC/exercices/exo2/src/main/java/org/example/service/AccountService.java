package org.example.service;

import org.example.dao.AccountDAO;
import org.example.models.Account;
import org.example.utils.DatabaseManager;


import java.sql.Connection;
import java.sql.SQLException;

public class AccountService {
    private AccountDAO accountDAO;
    private Connection connection;

    public AccountService(){
        try {
            connection = new DatabaseManager().getConnection();
            accountDAO = new AccountDAO(connection);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }




}
