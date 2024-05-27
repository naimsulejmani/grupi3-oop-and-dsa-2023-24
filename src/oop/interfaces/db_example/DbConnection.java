package oop.interfaces.db_example;

import java.util.List;

public interface DbConnection extends AutoCloseable {
    void connect() throws SQLException;

    void disconnect() throws SQLException;

    int executeUpdate(String sql) throws SQLException;

    List<Object> executeQuery(String sql) throws SQLException;
}
