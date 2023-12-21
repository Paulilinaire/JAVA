package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.Exception.CustomFormatException;
import org.example.Exception.TicketSoldException;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Event {

    private static int count = 0;
    private int id;

    private String name;

    private LocalDateTime dateTime;

    private EventLocation eventLocation;

    private double price;

    private int ticketsSoldNumber;

    private int eventLocationId;

    private Event() {
        id = ++count;
    }

    public Event(String name, LocalDateTime dateTime, EventLocation eventLocation, double price) throws CustomFormatException {
        this();
        setName(name);
        setDateTime(dateTime);
        setEventLocation(eventLocation);
        setPrice(price);
        ticketsSoldNumber = 0;
    }

    public Event(String name, LocalDateTime dateTime, double price, int eventLocationId) {
        this.name = name;
        this.dateTime = dateTime;
        this.price = price;
        this.eventLocationId = eventLocationId;
    }

    public Event(int id, String name, LocalDateTime dateTime, double price, int eventLocationId) {
        this(name, dateTime, price, eventLocationId);
        this.id = id;
    }

    public void setName(String name) throws CustomFormatException {
        if(name.length() > 2) {
            this.name = name;
        }else {
            throw new CustomFormatException("name should be gt 2 char");
        }
    }

    public void setDateTime(LocalDateTime dateTime) throws CustomFormatException {
        if(this.dateTime.isAfter(LocalDateTime.now())) {
            this.dateTime = dateTime;
        }else {
            throw new CustomFormatException("Datetime should be after then current datetime");
        }

    }

    public void setEventLocation(EventLocation eventLocation) {
        this.eventLocation = eventLocation;
    }

    public void setPrice(double price) throws CustomFormatException {
        if(price >= 0) {
            this.price = price;
        }
        else {
            throw new CustomFormatException("price should be positive");
        }
    }

    public boolean checkTicketSoldPossibility() {
        return ticketsSoldNumber < eventLocation.getCapacity();
    }

    public void cancelTicket() {
        if(ticketsSoldNumber == 0) {
            throw new TicketSoldException("No Ticket available to cancel");
        }
        ticketsSoldNumber--;
    }

    public void soldTicket() {
        if(!checkTicketSoldPossibility()){
            throw new TicketSoldException("Ticket sold out");
        }
        ticketsSoldNumber++;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateTime=" + dateTime +
                ", eventLocation=" + eventLocation +
                ", price=" + price +
                ", ticketsSoldNumber=" + ticketsSoldNumber +
                '}';
    }
}
