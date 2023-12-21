package org.example.utils;


import org.example.Exception.CustomFormatException;
import org.example.models.Customer;
import org.example.models.Event;
import org.example.models.EventLocation;
import org.example.services.CustomerService;
import org.example.services.EventLocationService;
import org.example.services.EventService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Ihm {

    private static final Scanner s = new Scanner(System.in);

    private static CustomerService customerService;
    private static EventLocationService eventLocationService;
    private static EventService eventService;

    private static final List<Customer> customersList = customerService.getAllCustomers();
    private static final List<EventLocation> locationsList = eventLocationService.getAllEventLocations();
    private static final List<Event> eventsList = eventService.getAllEvents();


    public Ihm() {
    }

    public static void start() {
        menu();
    }

    public static void menu (){
        try{
            System.out.println("----------menu---------");
            System.out.println("1/ Action Lieux");
            System.out.println("2/ Action Evenements");
            System.out.println("3/ Action client");
            System.out.println("0/ Quitter");
            System.out.println("Entrer votre choix :");
            int entry = s.nextInt();
            switch (entry){
                case 1:
                    locationMenu();
                    break;
                case 2 :
                    eventMenu();
                    break;
                case 3:
                    customerMenu();
                    break;
                case 0 :
                    break;
                default:
                    System.out.println("Entrer une valeur correspondant a un choix");
                    menu();
                    break;
            }

        }
        catch (InputMismatchException e){
            System.out.println("Entrer une valeur numerique ");
            menu();
        }

    }

    //gestion des lieux

    public static void locationMenu (){
        try{
            System.out.println("----------menu Lieu---------");
            System.out.println("1/ ajouter un lieu");
            System.out.println("2/ modifier un lieu");
            System.out.println("3/ supprimer un lieu");
            System.out.println("0/ retourner au menu generale");
            System.out.println("Entrer votre choix :");
            int entry = s.nextInt();
            switch (entry){
                case 1:
                    addLocation();
                    break;
                case 2:
                    updateLocation();
                    break;
                case 3 :
                    deleteLocation();
                    break;
                case 0:
                    menu();
                    break;
                default :
                    System.out.println("Entrer une valeur correspondant a un choix");
                    locationMenu();
                    break;
            }
        }
        catch (InputMismatchException | CustomFormatException e){
            System.out.println("Entrer une valeur numerique ");
            locationMenu();
        }
    }

    public static void addLocation () throws CustomFormatException {
        System.out.println("--------Ajouter lieu----------");
        System.out.println("Entrer le nom du lieu :");
        String name= s.nextLine();
        System.out.println("Entrer l'adresse du lieu :");
        String adress = s.nextLine();
        System.out.println("Entrer la capacité du lieu :");
        int capacity = capacityEntry();

        eventLocationService.createEventLocation(name,adress,capacity);
    }

    public static void updateLocation() throws CustomFormatException {
        System.out.println("--------Modifier lieu----------");
        showList(locationsList);
        System.out.println("Quel lieu voulez-vous modifier (n°id) : ");
        int entry = s.nextInt();

        System.out.println(locationsList.get(entry - 1));
        System.out.println("Entrer le nouveau nom : ");
        String newName = s.next();
        System.out.println("Entrer la nouvelle adresse : ");
        String newAddress = s.next();
        System.out.println("Entrer la nouvelle capacité du lieu :");
        int newCapacity = capacityEntry();

        EventLocation newEventLocation = new EventLocation(newName, newAddress, newCapacity);

        eventLocationService.updateEventLocation(newEventLocation);
        locationMenu();
    }

    public static void deleteLocation () {
        System.out.println("--------Supprimer lieu----------");
        showList(locationsList);
        System.out.println("Quel lieu voulez-vous supprimer (0 pour retour) : ");
        int entry = s.nextInt();

        if (entry == 0) {
            locationMenu();
        } else {
            eventLocationService.deleteEventLocation(entry);
            System.out.println("le lieu a bien été supprimé");
            locationMenu();
        }
    }

    public static int capacityEntry (){
        int entry = 0;
        do {
            System.out.println("Entrer la capacité du lieu :");
            entry = s.nextInt();
        }
        while (entry<=0);

        return entry;
    }



    // gestion des événements

    public static void eventMenu (){
        try{
            System.out.println("----------menu Evenement---------");
            System.out.println("1/ Ajouter un Evenement");
            System.out.println("2/ Modifier un Evenement");
            System.out.println("3/ Supprimer un Evenement");
            System.out.println("4/ Afficher la liste des evenements");
            System.out.println("0/ Retourner au menu generale");
            System.out.println("Entrer votre choix :");
            int entry = s.nextInt();
            switch (entry){
                case 1:
                    addEvent();
                    break;
                case 2:

                    break;
                case 3 :
                    suprEvenement();
                    break;
                case 4 :
                    showList(eventsList);
                    break;
                case 0:
                    menu();
                    break;
                default :
                    System.out.println("Entrer une valeur correspondant à un choix");
                    eventMenu();
                    break;
            }
        }
        catch (InputMismatchException e){
            System.out.println("Entrer une valeur numerique ");
            customerMenu();
        }
    }

    public static void addEvent (){
            System.out.println("--------Ajouter Evénement----------");

            System.out.println("Entrer le nom de l'evenement:");
            String nom = s.next();

            System.out.println("Entrer la date de l'evenement (format dd-MM-yyyy):");
            String date_string = s.next();
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
            Date date = formatter.parse(date_string);

    }

    public static void suprEvenement (){
        try{
            System.out.println("--------supr evenement----------");
            showList(listEvenement);
            System.out.println("quelle evenement vouler vous supprimer (0 pour retour) : ");
            int entry = s.nextInt();

            if(entry == 0){
                eventMenu();
            }
            else{
                listEvenement.remove(entry-1);
                System.out.println("l'evenement a bien ete supprimer");
                eventMenu();
            }
        }
        catch( InputMismatchException e){
            System.out.println("Entrer une valeur numerique ");
            suprEvenement();
        }
    }

    //gestion client

    public static void customerMenu (){
        try{
            System.out.println("----------menu Client---------");
            System.out.println("1/ Ajouter un Client");
            System.out.println("2/ Modifier un Client");
            System.out.println("3/ Supprimer un Client");
            System.out.println("4/ Acheter un billet");
            System.out.println("5/ Annuler un billet");
            System.out.println("6/ Afficher la liste des billets d'un clients");
            System.out.println("0/ Retourner au menu generale");
            System.out.println("Entrer votre choix :");
            int entry = s.nextInt();
            switch (entry){
                case 1:
                    addCustomer();
                    break;
                case 2:
                    updateCustomer();
                    break;
                case 3 :
                    deleteCustomer();
                    break;
                case 4 :
//                    buyTicket();
                    break;
                case 5 :
//                    cancelTicket();
                    break;
                case 6:
//                    showTicket();
                    break;
                case 0:
                    menu();
                    break;
                default :
                    System.out.println("Entrer une valeur correspondant a un choix");
                    customerMenu();
                    break;
            }
        }
        catch (InputMismatchException | CustomFormatException e){
            System.out.println("Entrer une valeur numérique ");
            customerMenu();
        }
    }

    public static void addCustomer () throws CustomFormatException {
        System.out.println("--------Ajouter client----------");
        System.out.println("Entrer le nom du client :");
        String lastname= s.nextLine();
        System.out.println("Entrer le prénom du client :");
        String firstname = s.nextLine();
        System.out.println("Entrer l'email du client :");
        String email = s.nextLine();

        customerService.createCustomer(lastname,firstname,email);
    }

    public static void updateCustomer (){
        System.out.println("--------Modifier client----------");
        showList(customersList);
        System.out.println("Quel client voulez-vous modifier (n°id) : ");
        int entry = s.nextInt();

        System.out.println(locationsList.get(entry - 1));
        System.out.println("Entrer à nouveau le nom : ");
        String newLastname = s.next();
        System.out.println("Entrer à nouveau le prénom : ");
        String newFirstname = s.next();
        System.out.println("Entrer à nouveau l'adresse email :");
        String newEmail = s.nextLine();

        Customer newCustomer = new Customer(newLastname, newFirstname, newEmail);

        customerService.updateCustomer(newCustomer);
        customerMenu();
    }

    public static void deleteCustomer (){
        System.out.println("--------Supprimer client----------");
        showList(customersList);
        System.out.println("Quel client voulez-vous supprimer (0 pour retour) : ");
        int entry = s.nextInt();

        if (entry == 0) {
            customerMenu();
        } else {
            customerService.deleteCustomer(entry);
            System.out.println("le lieu a bien ete supprimé");
            customerMenu();
        }
    }

    //fonction global
    public static void showList (List list){
        list.forEach(System.out::println);
        System.out.println();
    }




}
