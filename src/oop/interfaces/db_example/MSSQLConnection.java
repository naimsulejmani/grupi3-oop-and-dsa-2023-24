package oop.interfaces.db_example;

import java.util.List;

public class MSSQLConnection implements DbConnection {
    private ConnectionString connectionString;
    private final int SQL_PORT = 1433;

    public MSSQLConnection(String server, String database, String userId, String password) {
        this.connectionString = new ConnectionString(server, database, userId, password, SQL_PORT);
    }

    public MSSQLConnection(String connectionString) throws SQLException {
        this.connectionString = new ConnectionString(connectionString);
    }


    @Override
    public void connect() throws SQLException {
        System.out.println("Connecting to MSSQL server... DB -> " + connectionString.getDatabase());
    }

    @Override
    public void disconnect() throws SQLException {
        System.out.println("Disconnect from MSSQL server... DB -> " + connectionString.getDatabase());
    }

    @Override
    public int executeUpdate(String sql) throws SQLException {
        if (sql.contains("INSERT") || sql.contains("UPDATE") || sql.contains("DELETE")
                || sql.contains("TRUNCATE") || sql.contains("CREATE") || sql.contains("ALTER")
                || sql.contains("DROP")) {
            System.out.println("Executing query as: " + sql);
            return 1;
        }
        throw new SQLException("Invalid SQL Query provided!");
    }

    @Override
    public List<Object> executeQuery(String sql) throws SQLException {
        if (!sql.contains("SELECT")) {
            throw new SQLException("Invalid SQL Query provided!");
        }
        return List.of("Adnan", "Edin", "Eriona", "Festina", "Brikend");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing MSSQL server...");
    }
}
