package org.example.dao;

import org.example.models.Account;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class AccountDAO extends BaseDAO<Account>{
    public AccountDAO(Connection connection) {
        super(connection);
    }
    @Override
    public boolean save(Account element) throws SQLException {
        request = "INSERT INTO account (balance, id_client) VALUES (?, ?)";
        statement = _connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setDouble(1, element.getBalance());
        statement.setInt(2, element.getClient().getId());
        int nbRows = statement.executeUpdate();
        resultSet = statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRows == 1;
    }

    @Override
    public boolean update(Account element) throws SQLException {
        request = "UPDATE account SET balance = ?, id_client = ? WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setDouble(1, element.getBalance());
        statement.setInt(2, element.getClient().getId());
        statement.setInt(3,element.getId());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }

    @Override
    public boolean delete(Account element) throws SQLException {
        request = "DELETE FROM account WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1,element.getId());
        int nbRows = statement.executeUpdate();
        return nbRows == 1;
    }


    @Override
    public Account get(int id) throws SQLException {
        Account account = null;
        request = "SELECT * FROM account WHERE id = ?";
        statement = _connection.prepareStatement(request);
        statement.setInt(1,id);
        resultSet = statement.executeQuery();
        if(resultSet.next()){
            account = new Account(
                    resultSet.getInt("id"),
                    resultSet.getDouble("balance"),
                    resultSet.getInt("id_client")
            );
        }
        return account;
    }


}
