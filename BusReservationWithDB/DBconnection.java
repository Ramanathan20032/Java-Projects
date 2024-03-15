package BusReservationWithDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    // static - common values
    // final - fixed values
    private static final String url = "jdbc:mysql://localhost:3306/Busresv";
    private static final String userName = "root";
    private static final String passWord = "Ram@2003";

    public static Connection getConnection() throws SQLException {
         return DriverManager.getConnection(url,userName,passWord);
    }
}
