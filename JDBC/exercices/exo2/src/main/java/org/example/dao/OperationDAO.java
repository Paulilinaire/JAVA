package org.example.dao;

import org.example.enums.OperationStatus;
import org.example.models.Operation;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OperationDAO extends BaseDAO<Operation> {
    public OperationDAO(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(Operation element) throws SQLException {
        request = "INSERT INTO operation (amount, status) VALUES (?, ?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setDouble(1, element.getAmount());
        statement.setString(2, element.getStatus().name());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1;
    }

//    @Override
//    public boolean update(Operation element) throws SQLException {
//        request = "UPDATE person SET first_name = ?, last_name = ? WHERE id = ?";
//        statement = _connection.prepareStatement(request);
//        statement.setDouble(1, element.getAmount());
//        statement.setString(2, element.getStatus().name());
//        statement.setInt(3,element.getId());
//        int nbRows = statement.executeUpdate();
//        return nbRows == 1;
//    }
//
//    @Override
//    public boolean delete(Operation element) throws SQLException {
//        Operation operation = null;
//        request = "DELETE FROM person WHERE id = ?";
//        statement = _connection.prepareStatement(request);
//        statement.setInt(1,element.getId());
//        int nbRows = statement.executeUpdate();
//        return nbRows == 1;
//    }


    @Override
    public Operation get(int id) throws SQLException {
        Operation operation = null;
        request = "SELECT * FROM operation WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1,id);
        resultSet = statement.executeQuery();
        if(resultSet.next()){
            operation = new Operation(resultSet.getInt("id"),
                    resultSet.getDouble("amount"),
                    OperationStatus.valueOf(resultSet.getString("status")));
        }
        return operation;
    }

}
