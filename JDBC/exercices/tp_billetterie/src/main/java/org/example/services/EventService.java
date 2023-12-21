package org.example.services;

import org.example.Exception.CustomFormatException;
import org.example.dao.EventDAO;
import org.example.models.Event;
import org.example.utils.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

public class EventService {
    private EventDAO eventDAO;
    private Connection connection;

    public EventService() {
        connection = DatabaseManager.getConnection();
        eventDAO = new EventDAO(connection);
    }

    public boolean createEvent(String name, LocalDateTime dateTime, double price, int eventLocationId) throws CustomFormatException {
        Event event = new Event(name, dateTime, price, eventLocationId);
        event.setName(name);
        event.setDateTime(dateTime);
        event.setPrice(price);
        event.setEventLocationId(eventLocationId);
        try {
            return eventDAO.save(event);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateEvent(Event event){
        try {
            return eventDAO.update(event);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Event getEvent(int id){
        try {
            return eventDAO.get(id);
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean deleteEvent(int id){
        Event event = null;
        try {
            event = eventDAO.get(id);
            if(event != null){
                return eventDAO.delete(event);
            }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public List<Event> getAllEvents(){
        try {
            return eventDAO.getAll();
        }catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}



