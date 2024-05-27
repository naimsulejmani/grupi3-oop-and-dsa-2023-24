package oop.interfaces.db_example;

import java.util.List;

public class Demo {
    public static void main(String[] args) {

        if (args.length < 2) {
            throw new IllegalArgumentException("Missing arguments such as driver  & connectionString!");
        }

        String driver = args[0];
        String connectionString = args[1];

        //close()
        try (DbConnection connection = getConnection(driver, connectionString)) {
            connection.connect();
            int rowAffected = connection.executeUpdate("""
                    INSERT INTO Person(id, name, surname)
                    VALUES (1, 'naim','sulejmani;);
                    """);
            System.out.println("Rows affected: " + rowAffected);

            List<Object> resultSet = connection.executeQuery("""
                    SELECT Name FROM Person;
                    """);
            for (Object object : resultSet) {
                System.out.println("Name: " + object);
            }
            connection.disconnect();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private static DbConnection getConnection(String driver, String connectionString) throws SQLException {
        switch (driver) {
            case "mssql" -> {
                return new MSSQLConnection(connectionString);
            }
            case "mysql" -> {
                return new MySQLConnection(connectionString);
            }
            case "postgres" -> {
                return new PostgreSQLConnection(connectionString);
            }
            default -> throw new IllegalArgumentException("Invalid driver provided!");
        }

        /*
            return switch(driver) {

            }

         */
    }
}


















