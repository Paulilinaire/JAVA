package org.example.dao;

import org.example.models.EventLocation;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EventLocationDAO extends BaseDAO<EventLocation> {
    public EventLocationDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(EventLocation element) throws SQLException {
        request = "INSERT INTO event_location (name, address, capacity) VALUES (?, ?, ?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getName());
        statement.setString(2, element.getAddress());
        statement.setInt(3, element.getCapacity());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1;
    }

    @Override
    public boolean update(EventLocation element) throws SQLException {
        request = "UPDATE event_location SET name = ?, address = ?, capacity = ? WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setString(1, element.getName());
        statement.setString(2, element.getAddress());
        statement.setInt(3, element.getCapacity());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public boolean delete(EventLocation element) throws SQLException {
        request = "DELETE FROM event_location WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1,element.getId());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public EventLocation get(int id) throws SQLException {
        EventLocation eventLocation = null;
        request = "SELECT * FROM event_location WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1,id);
        resultSet = statement.executeQuery();
        if(resultSet.next()){
            eventLocation = new EventLocation(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("adress"),
                    resultSet.getInt("capacity"));
        }
        return eventLocation;
    }

    @Override
    public List<EventLocation> getAll() throws SQLException {
        List<EventLocation> result = new ArrayList<>();
        request = "SELECT * FROM event_location";
        statement = _connection.prepareStatement(request);
        resultSet = statement.executeQuery();
        while (resultSet.next()){
            EventLocation eventLocation = new EventLocation(resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("adress"),
                    resultSet.getInt("capacity"));
            result.add(eventLocation);
        }
        return result;
    }

}
