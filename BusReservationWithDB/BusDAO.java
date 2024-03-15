package BusReservationWithDB;

import java.sql.*;

public class BusDAO {
// Bus Data Access Object.
    public void displayBusInfo() throws SQLException {
        String query = "select * from bus;";
        Connection con = DBconnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()){
            System.out.println("Bus No   : " + rs.getInt(1));
            if (rs.getInt(2) == 0) {
                System.out.println("AC       : No");
            }
            else {
                System.out.println("AC       : Yes");
            }
            System.out.println("Capacity : " + rs.getInt(3));
            System.out.println();
        }
        System.out.println("-----------------------------");
    }

    public int getCapacity(int id) throws SQLException {
        String query = "select capacity from bus where id = " + id;
        Connection con = DBconnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        return rs.getInt(1);
    }
}
