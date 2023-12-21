package org.example.dao;

import org.example.models.Event;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EventDAO extends BaseDAO<Event> {
    public EventDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Event element) throws SQLException {
        request = "INSERT INTO event (name,date, price, id_event_location) VALUES (?,?,?,?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1,element.getName());
        statement.setString(2,element.getDateTime().toString());
        statement.setDouble(3,element.getPrice());
        statement.setInt(4,element.getEventLocationId());
        int nbRow = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRow == 1;
    }

    @Override
    public boolean update(Event element) throws SQLException {
        request = "UPDATE event SET (name = ?,date = ?, price = ?, id_event_location = ?)  WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setString(1,element.getName());
        statement.setString(2,element.getDateTime().toString());
        statement.setDouble(3,element.getPrice());
        statement.setInt(4,element.getEventLocation().getId());
        int nbRow = statement.executeUpdate();
        return nbRow == 1;
    }

    @Override
    public boolean delete(Event element) throws SQLException {
        request = "DELETE FROM event WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1,element.getId());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public Event get(int id) throws SQLException {
        Event event = null;
        request = "SELECT * FROM event WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1,id);
        resultSet = statement.executeQuery();
        if(resultSet.next()){
            int eventId = resultSet.getInt("id");
            String eventName = resultSet.getString("name");
            LocalDateTime eventDateTime = resultSet.getTimestamp("date").toLocalDateTime();
            double eventPrice = resultSet.getDouble("price");
            int eventLocationId = resultSet.getInt("id_event_location");

            event = new Event(eventId, eventName, eventDateTime, eventPrice, eventLocationId);
        }
        return event;
    }

    @Override
    public List<Event> getAll() throws SQLException {
        List<Event> events = new ArrayList<>();
        request = "SELECT * FROM event";
        statement = _connection.prepareStatement(request);
        resultSet = statement.executeQuery();

        while (resultSet.next()) {
            int eventId = resultSet.getInt("id");
            String eventName = resultSet.getString("name");
            LocalDateTime eventDateTime = resultSet.getTimestamp("date").toLocalDateTime();
            double eventPrice = resultSet.getDouble("price");
            int eventLocationId = resultSet.getInt("id_event_location");

            Event event = new Event(eventId, eventName, eventDateTime, eventPrice, eventLocationId);
            events.add(event);
        }

        return events;
    }

    public List<Event> getEventsAvailable() throws SQLException {
        List<Event> eventsAvailableList = new ArrayList<>();
        request = " SELECT name, capacity, ticket_sold FROM event INNER JOIN event_location " +
                "ON event_location.id = event.id_event_location WHERE (capacity - ticket_sold) > 0";
        statement = _connection.prepareStatement(request);
        resultSet = statement.executeQuery();
        while (resultSet.next()) {
            int eventId = resultSet.getInt("id");
            String eventName = resultSet.getString("name");
            LocalDateTime eventDateTime = resultSet.getTimestamp("date").toLocalDateTime();
            double eventPrice = resultSet.getDouble("price");
            int eventLocationId = resultSet.getInt("id_event_location");

            Event event = new Event(eventId, eventName, eventDateTime, eventPrice, eventLocationId);
            eventsAvailableList.add(event);
        }
        return eventsAvailableList;
    }

}
