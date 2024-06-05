
package Controlador_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controlador_1 {
    
    private Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/consultorio";
    private static final String USER = "root";
    private static final String PASSWORD = "1173432056";

    public Controlador_1() throws SQLException {
        connection = DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public ResultSet executeQuery(String query) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(query);
        return statement.executeQuery();
    }

    public int executeUpdate(String query) throws SQLException {
        PreparedStatement statement = connection.prepareStatement(query);
        return statement.executeUpdate();
    }

    public void close() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
