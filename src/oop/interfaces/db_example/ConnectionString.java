package oop.interfaces.db_example;

public class ConnectionString {
    private String server;
    private String database;
    private String userId;
    private String password;
    private int port;

    public ConnectionString(String server, String database, String userId, String password, int port) {
        this.server = server;
        this.database = database;
        this.userId = userId;
        this.password = password;
        this.port = port;
    }

    public ConnectionString(String connectionString) throws SQLException {
        String[] splitter = connectionString.split(";");
        if (splitter.length < 5) {
            throw new SQLException("Invalid connection string provided!");
        }
        this.server = splitter[0].split("=")[1];
        this.database = splitter[1].split("=")[1];
        this.userId = splitter[2].split("=")[1];
        this.password = splitter[3].split("=")[1];
        this.port = Integer.parseInt(splitter[4].split("=")[1]);
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return String.format("Server=%s;Database=%s;Uid=%s;Pwd=%s;Port=%d",
                server, database, userId, password, port);
    }
}









