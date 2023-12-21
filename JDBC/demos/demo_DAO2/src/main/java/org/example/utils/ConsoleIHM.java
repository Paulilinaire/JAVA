package org.example.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.models.Person;
import org.example.service.PersonService;

import java.util.List;
import java.util.Scanner;

@Data
@AllArgsConstructor
public class ConsoleIHM {
    private static PersonService personService = new PersonService();
    private static Scanner scanner = new Scanner(System.in);

    public void start(){
        String choice;
        do {
            menu();
            choice = scanner.nextLine();
            switch (choice){
                case "1":
                    createUser();
                    break;
                case "2":
                    updateUser();
                    break;
                case "3":
                    deleteUser();
                    break;
                case "4":
                    displayAllUsers();
                    break;
                case "0":
                    break;
            }

        } while (!choice.equals("0"));
    }

    private void menu(){
        System.out.println("----------Menu---------");
        System.out.println("1/ Ajouter un utilisateur");
        System.out.println("2/ Mettre à jour un utilisateur");
        System.out.println("3/ Supprimer un utilisateur");
        System.out.println("4/ Afficher un utilisateur");
        System.out.println("5/ Afficher tous les utilisateurs");
        System.out.println("0/ Quitter");
        System.out.println("Entrez votre choix :");
    }

    private static void createUser() {
        System.out.print("Nom  : ");
        String firstName = scanner.nextLine();
        System.out.print("Prenom : ");
        String lastName = scanner.nextLine();


        personService.createPerson(firstName,lastName);
    }

    private static void updateUser() {
        System.out.print("ID de l'utilisateur à modifier : ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Clear the newline character

        Person person = personService.getPerson(id);
        if (person == null) {
            System.out.println("Utilisateur non trouvé !");
            return;
        }

        System.out.print("Nouveau nom d'utilisateur : ");
        String newFirstName = scanner.nextLine();
        System.out.print("Nouveau prenom : ");
        String newLastName = scanner.nextLine();

        person.setFirstName(newFirstName);
        person.setLastName(newLastName);

        personService.updatePerson(person);
        System.out.println("Utilisateur mis à jour avec succès !");
    }

    private static void deleteUser() {
        System.out.print("ID de l'utilisateur à supprimer : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        personService.deletePerson(id);
        System.out.println("Utilisateur supprimé avec succès !");
    }

    private static void displayAllUsers() {
        List<Person> persons = personService.getAllPersons();
        for (Person person : persons) {
            System.out.println(person);
        }
    }





}
