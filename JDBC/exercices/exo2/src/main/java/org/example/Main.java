package org.example;


import org.example.utils.DatabaseManager;
import org.example.utils.IHMconsole;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Test Connection

        try{
            DatabaseManager dataBaseManager = new DatabaseManager();
            Connection connection = dataBaseManager.getConnection();
            if (connection != null){
                System.out.println("connexion ok !");
            }else {
                System.out.println("connexion non ok !!!");
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        IHMconsole.start();
    }
}