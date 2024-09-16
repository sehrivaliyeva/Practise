package jdbctask2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection implements AutoCloseable {

    private Connection connection;

    public MyConnection() {
        final String URL = "jdbc:mysql://localhost:3306/j8";
        final String USER = "root";
        final String PASSWORD = "1234";
        try {
            this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection connect() {
        return connection;
    }

    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}

