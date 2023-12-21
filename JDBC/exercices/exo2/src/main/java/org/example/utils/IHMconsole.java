package org.example.utils;

import org.example.models.Account;
import org.example.models.Client;
import org.example.models.Operation;
import org.example.service.BankService;

import java.util.List;
import java.util.Scanner;

public class IHMconsole {
    private static BankService bankService = new BankService();
    private static Scanner scanner = new Scanner(System.in);

    public static void start() {
        boolean running = true;
        while (running) {
            System.out.println("*****************************");
            System.out.println("*********** MENU ************");
            System.out.println("*****************************");
            System.out.println("1. Création de client et compte");
            System.out.println("2. Dépôt");
            System.out.println("3. Retrait");
            System.out.println("4. Affichage compte");
            System.out.println("5. Ajouter un compte à un client");
            System.out.println("6. Voir tous les comptes d'un client");
            System.out.println("7. Création de client");
            System.out.println("8. Affichage des clients");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createClientAndAccount();
                    break;
                case 2:
                    makeAdeposit();
                    break;
                case 3:
                    makeAwithdrawl();
                    break;
                case 4:
                    getAccountOperations();
                    break;
                case 5:
                    showAllAccountClient();
                    break;
                case 6:
                    addAccountToCLient();
                    break;
                case 7:
                    createClient();
                    break;
                case 8:
                    displayClients();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Choix invalide !");
            }
        }
        System.out.println("Bye bye !");
    }

    private static void createClientAndAccount() {
        System.out.println("***** Choix 1 *****");
        System.out.print("Nom  : ");
        String firstName = scanner.nextLine();
        System.out.print("Prénom : ");
        String lastName = scanner.nextLine();
        System.out.println("Numéro de téléphone : ");
        String phoneNumber = scanner.nextLine();

        Client client = bankService.createClient(firstName,lastName, phoneNumber);
        bankService.createAccount(client.getId());
    }

    private static void makeAdeposit(){
        System.out.println("***** Choix 2 *****");
        System.out.print("Saisir le numéro de compte : ");
        int idClient = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Saisir le montant à déposer : ");
        double depositAmount = scanner.nextDouble();
        scanner.nextLine();
        bankService.getAccount(idClient);
        bankService.deposit(depositAmount);
    }
    private static void makeAwithdrawl(){
        System.out.println("***** Choix 3 *****");
        System.out.print("Saisir le numéro de compte : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Saisir le montant à retirer : ");
        double withdrawlAmount = scanner.nextDouble();
        scanner.nextLine();

    }

    private static void getAccountOperations(){
        System.out.println("***** Choix 4 *****");
        System.out.print("Saisir le numéro de compte : ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Account account = bankService.getAccount(id);
        if (account != null){
            for (Operation)
        }
    }

    private static void showAllAccountClient(){
        System.out.println("***** Choix 5 *****");
        System.out.print("Saisir le numéro du client : ");
        int idClient = scanner.nextInt();
        scanner.nextLine();
    }

    private static void addAccountToCLient(){
        System.out.println("***** Choix 6 *****");
        System.out.print("Saisir le numéro du client : ");
        int idClient = scanner.nextInt();
        scanner.nextLine();


    }

    private static void createClient() {
        System.out.println("***** Choix 7 *****");
        System.out.print("Nom  : ");
        String firstName = scanner.nextLine();
        System.out.print("Prénom : ");
        String lastName = scanner.nextLine();
        System.out.println("Numéro de téléphone : ");
        String phoneNumber = scanner.nextLine();

        Client client = bankService.createClient(firstName, lastName, phoneNumber);
    }

    private static void displayClients() {
        List<Client> clients = bankService.getAllClients();
        for (Client client : clients) {
            System.out.println(client);
        }
    }
}
