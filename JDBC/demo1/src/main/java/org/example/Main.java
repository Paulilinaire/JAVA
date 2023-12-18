package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) {

        // connection à ma bdd demo_jdbc MySQL
        String url = "jdbc:mysql://localhost:3306/demo_jdbc";

        try {
        Connection connection = DriverManager.getConnection(url, "root", "1234");
        // getConnection a la possibilité de lèver une exception MySql, voila pk try catch est indispensable
            if (connection != null) {
                System.out.println("connexion ok");
            } else {
                System.out.println("connexion non ok");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // Meilleur pratique : mettre la connection dans une classe à part. (voir classe ConnectionUtils)

    }
}
