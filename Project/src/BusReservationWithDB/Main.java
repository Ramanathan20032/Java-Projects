package BusReservationWithDB;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        BusDAO busDAO = new BusDAO();
        try {
            busDAO.displayBusInfo();

            int userOpt = 1;
            Scanner sc = new Scanner(System.in);

            while (userOpt == 1) {
                System.out.println("Enter 1 for Booking. 2 for Exit");
                userOpt = sc.nextInt();
                if (userOpt == 1) {
                    Booking booking = new Booking();
                    if (booking.isAvailable()) {
                        BookingDAO bookingDAO = new BookingDAO();

                        bookingDAO.addBooking(booking);
                        System.out.println("your booking is Confirmed");
                    } else {
                        System.out.println("sorry Bus is full. try for another Date or Bus..");
                    }
                }
                sc.close();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
