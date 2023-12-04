package org.example.classes;

import lombok.Data;
import lombok.Getter;
import org.example.exceptions.TicketSaleException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

@Data
public class Event {
    private static int counter = 1;

    private int id;
    private String name;
    private LocalDate date;
    private LocalTime hour;
    private Place place;
    private double price;
    private int ticketsSold;

    @Getter
    public ArrayList<Event> allEvents = new ArrayList<>();

    public Event(String name, LocalDate date, LocalTime hour, double price) {
        this.id = counter++;
        this.name = name;
        this.date = date;
        this.hour = hour;
        this.price = price;
        allEvents.add(this);
    }

    private Event findEvent(int id) {
        for (Event event : allEvents) {
            if (event.getId() == id) {
                return event;
            }
        }
        return null;
    }

    public boolean addEvent(String name, String address, int capacity) {
        Event newEvent = new Event(name, date, hour, price);
        return allEvents.add(newEvent);
    }

    public boolean deleteEvent(int id){
        Event event = findEvent(id);
        if(event != null){
            return allEvents.remove(event);
        }
        return false;
    }

    public boolean changeEvent(int eventId, String newName, LocalDate newDate, LocalTime newHour, Place newPlace, double newPrice) {
        Event event = findEvent(id);
        if (event != null) {
            event.setName(newName);
            event.setDate(newDate);
            event.setHour(newHour);
            event.setPlace(newPlace);
            event.setPrice(newPrice);
            return true;
        }
        return false;
    }

    public boolean checkTicketAvailability() {
        return ticketsSold < place.getCapacity();
    }

    public void sellTicket() throws TicketSaleException {
            if (checkTicketAvailability()) {
                ticketsSold++;
                System.out.println("Billet vendu!");
            } else {
                throw new TicketSaleException("Oups, tous les billets sont vendus !");
            }
    }

    public void cancelTicket() throws TicketSaleException {
            if (!checkTicketAvailability()) {
                ticketsSold--;
                System.out.println("Billet annulé!");
            } else {
                throw new TicketSaleException("Attention, il n'y a aucun billet à annuler !");
            }
    }

    //add setDateTime exception (if this.date = this.date.isAfterLocalDateTime)
}
