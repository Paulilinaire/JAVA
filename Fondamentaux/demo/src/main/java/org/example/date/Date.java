package org.example.date;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {

    public static void main() {
        // date d'ajourd'hui
        LocalDate dateOfToday = LocalDate.now();
        System.out.println("Date du jour: " + dateOfToday);

        // date choisie
        LocalDate dueDate = LocalDate.of(2024, 12, 17);
        System.out.println("Date choisie: " + dueDate);

        // Récupération d'élément de ma date
        int ourYear = dateOfToday.getYear();
        int ourMonth = dateOfToday.getMonthValue();
        int ourDay = dateOfToday.getDayOfMonth();
        System.out.printf("Nous sommes le %d ème jour du %d ème mois de l'année %d.", ourDay, ourMonth, ourYear);

        //Ajouter ou soustraire des jours
        LocalDate dateInThreeDays = dateOfToday.plusDays(3);
        System.out.println("date dans 3 jours: " + dateInThreeDays);
        System.out.println(dateOfToday.isBefore(dateInThreeDays));
        System.out.println(dateOfToday.isAfter(dateInThreeDays));
        System.out.println(dateOfToday.isEqual(dateInThreeDays));

        LocalDate dateMinusThreeDays = dateOfToday.minusDays(3);
        System.out.println(dateMinusThreeDays);
        System.out.println(dateOfToday.isBefore(dateMinusThreeDays));
        System.out.println(dateOfToday.isAfter(dateMinusThreeDays));
        System.out.println(dateOfToday.isEqual(dateMinusThreeDays));

        // Formatage de la date
        String dateInString = "01-01-23";

        LocalDate dateIntoString = LocalDate.parse(dateInString, DateTimeFormatter.ofPattern("dd-MM-yy"));
        //bonne pratique => à mettre dans un try catch, try "dateIntoString" ok sinon "ressaisir la date".
        System.out.println(dateIntoString);
        System.out.println(dateOfToday.isBefore(dateIntoString));
    }


}
