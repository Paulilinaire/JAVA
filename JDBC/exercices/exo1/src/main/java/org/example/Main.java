package org.example;

import org.example.ihm.Ihm;
import org.example.utils.ConnectionUtils;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Test Connection

//        try {
//            Connection connection = ConnectionUtils.getMySQLConnection();
//            if (connection != null) {
//                System.out.println("connexion ok !");
//            } else {
//                System.out.println("connexion non ok !");
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }

        Ihm ihm = new Ihm();
        ihm.start();

    }
}