package org.example.services;

import org.example.Exception.CustomFormatException;
import org.example.dao.EventLocationDAO;
import org.example.models.EventLocation;
import org.example.utils.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class EventLocationService {
        private EventLocationDAO eventLocationDAO;
        private Connection connection;

        public EventLocationService() {
            connection = DatabaseManager.getConnection();
            eventLocationDAO = new EventLocationDAO(connection);
        }

        public EventLocation createEventLocation(String name, String address, int capacity) throws CustomFormatException {
            EventLocation eventLocation = new EventLocation(name, address, capacity);
            eventLocation.setName(name);
            eventLocation.setAddress(address);
            eventLocation.setCapacity(capacity);
            try {
                return eventLocationDAO.save(eventLocation);
            }catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public boolean updateEventLocation(EventLocation eventLocation){
            try {
                return eventLocationDAO.update(eventLocation);
            }catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public EventLocation getEventLocation(int id){
            try {
                return eventLocationDAO.get(id);
            }catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public boolean deleteEventLocation(int id){
            EventLocation eventLocation = null;
            try {
                eventLocation = eventLocationDAO.get(id);
                if(eventLocation != null){
                    return eventLocationDAO.delete(eventLocation);
                }
            }catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return false;
        }

        public List<EventLocation> getAllEventLocations(){
            try {
                return eventLocationDAO.getAll();
            }catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }



    }


