package BusReservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    String passenger;
    int busNo;
    Date date;

    Booking(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Passenger : ");
        this.passenger = sc.next();
        System.out.println("Enter bus No : ");
        this.busNo = sc.nextInt();
        System.out.println("Enter date dd-mm-yyyy");
        String dateInput = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for(Bus bus : buses){
            if(bus.getBusNo() == busNo){
                capacity = bus.getCapacity();
            }
        }

        int booked = 0;
        for(Booking b : bookings){
            if(b.busNo == busNo && date.equals(date)){
                booked++;
            }
        }
        return booked < capacity ? true : false;
    }
}
