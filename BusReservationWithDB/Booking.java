package BusReservationWithDB;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    String passengerName;
    int busNo;
    Date date;


    Booking(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Passenger Name : ");
        this.passengerName = sc.next();
        System.out.println("Enter the Bus No : ");
        this.busNo = sc.nextInt();
        System.out.println("Enter the Date dd-MM-yyyy : ");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean isAvailable() throws SQLException {

        BusDAO busDAO = new BusDAO();
        BookingDAO BookingDAO = new BookingDAO();

        int capacity = busDAO.getCapacity(busNo);

        int booked = BookingDAO.getBookedCount(busNo,date);

        return booked < capacity ? true : false;

    }
}
