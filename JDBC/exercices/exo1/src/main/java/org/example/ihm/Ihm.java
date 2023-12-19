package org.example.ihm;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.utils.ConnectionUtils;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

@Data
@AllArgsConstructor
public class Ihm {

    private Scanner scanner = new Scanner(System.in);
    Connection connection = null;

    public Ihm() {
    }

    public void start() {
        this.menuGeneral();
    }

    public void menuGeneral() {
        try {
            System.out.println("----------Menu---------");
            System.out.println("1/ Afficher la totalité des etudiants");
            System.out.println("2/ Afficher les étudiants d'une classes");
            System.out.println("3/ Supprimer un étudiant");
            System.out.println("3/ Recherche étudiant par nom/prénom");
            System.out.println("0/ quitter");
            System.out.println("Entrez votre choix :");
            int entry = scanner.nextInt();
            switch (entry) {
                case 1:
                    this.showStudents();
                    break;
                case 2:
                    this.showStudentsFromOneClass();
                    break;
                case 3:
                    this.deleteStudent();
                    break;
                case 4:
                    this.searchStudentByName();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Entrez une valeur correspondant a un choix");
                    this.menuGeneral();
                    break;
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrez une valeur numérique ");
            this.menuGeneral();
        }

    }

    public void showStudents() {
        try {
            connection = ConnectionUtils.getMySQLConnection();
            System.out.println("Connexion ok !");
            System.out.println();
            String request = "SELECT * FROM student";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(request);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + ") " + resultSet.getString("first_name") + " " + resultSet.getString("last_name"));
            }
            statement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            // Ferme la connexion à la bdd
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void showStudentsFromOneClass() {
        try {
            connection = ConnectionUtils.getMySQLConnection();
            System.out.println("Connexion ok !");
            System.out.println("Entrez le numéro de la classe :");
            int entry = scanner.nextInt();
            System.out.println();
            String request = "SELECT * FROM student WHERE classroom_nb = " + entry;
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(request);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + ") " + resultSet.getString("first_name") + " " + resultSet.getString("last_name"));
            }
            statement.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            // Ferme la connexion à la bdd
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void deleteStudent() {
        try {
            connection = ConnectionUtils.getMySQLConnection();
            System.out.println("Connexion ok !");
            System.out.println("Entrez le prénom à supprimer :");
            String firstName = scanner.next();
            System.out.println("Entrez le nom à supprimer :");
            String lastName = scanner.next();
            System.out.println();

            String request = "DELETE FROM student WHERE first_name = ? AND last_name= ?";
                PreparedStatement preparedStatement = connection.prepareStatement(request);
                preparedStatement.setString(1, firstName);
                preparedStatement.setString(2, lastName);
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("L'étudiant a bien été supprimé.");
                } else {
                    System.out.println("Aucun étudiant trouvé avec le prénom et nom fournis.");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                // Ferme la connexion à la bdd
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public void searchStudentByName(){

        }
    }

