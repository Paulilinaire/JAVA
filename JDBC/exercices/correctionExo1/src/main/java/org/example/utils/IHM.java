package org.example.utils;

import org.example.entity.Student;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class IHM {
    private Scanner scanner;

    public IHM() {
        this.scanner = new Scanner(System.in);
    }

    public void start(){
        String choice;
        do {
            menu();
            choice = scanner.nextLine();
            switch (choice){
                case "1":
                    addStudent();
                    break;
                case "2":
                    getAllStudents();
                    break;
                case "3":
                    getAllStudentsByClass();
                    break;
                case "4":
                    deleteStudent();
                    break;
                case "0":
                    break;
            }

        } while (!choice.equals("0"));

    }
        private void menu(){
            System.out.println("1- Ajouter un étudiant");
            System.out.println("2- Afficher tous les étudiants");
            System.out.println("3- Afficher tous les étudiants d'une classe");
            System.out.println("4- Supprimer un étudiant");
            System.out.println("0- Quitter");
        }

        private void addStudent(){
            System.out.println("Saisir le prénom : ");
            String firstName = scanner.nextLine();
            System.out.println("Saisir le nom : ");
            String lastName = scanner.nextLine();
            System.out.println("Saisir le numéro de classe : ");
            int nbClass = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Saisir la date du diplôme (jj-mm-aaaa): ");
            String dateDegreeString = scanner.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date dateDegree = null;
            try {
                dateDegree = dateFormat.parse(dateDegreeString);
            } catch (ParseException e){
                dateDegree = new Date("01/01/2005");
            }
            Student student = new Student(firstName, lastName, nbClass, dateDegree);
            try {
                if(student.save()){ // if student.save est à true
                    System.out.println("Etudiant ajouté avec l'id : " + student.getId());
                } else {
                    System.out.println("Erreur dans l'ajout de l'étudiant en bdd");
                }
            } catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }

        private void getAllStudents(){
            try {
                Student.getAll().forEach(e -> System.out.println(e));
            } catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }

        private void getAllStudentsByClass(){
            System.out.println("Saisir le numéro de classe : ");
            int nbClass = scanner.nextInt();
            scanner.nextLine();
            try {
                Student.getByClass(nbClass).forEach(e -> System.out.println(e));
            } catch (SQLException e){
                System.out.println(e.getMessage());
            }

        }
        private void deleteStudent(){
            System.out.println("Saisir l'id de l'étudiant : ");
            int studentId = scanner.nextInt();
            scanner.nextLine();
            try {
                Student student = Student.getById(studentId);
                if(student != null){
                    if(student.delete()){ // double vérification, 1ère pour trouver l'id de l'étudiant, 2ème pour savoir si la suppression est possible
                        System.out.println("Etudiant supprimé");
                    } else {
                        System.out.println("Erreur lors de la suppression de l'étudiant");
                    }
                } else {
                    System.out.println("Pas d'étudiant avec cet id");
                }
            } catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
}
