package PRACTICAL;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Reservation reservation = new Reservation();
        String reservationId;
        String name;
        String address;
        String phone;
        Date departureDate;
        Date returnDate;
        Passenger passenger;
        Iterator<Passenger> iterator;

        boolean loop = true;
        while (loop) {
            System.out.println("menu");
            System.out.println("1. Add reservation. ");
            System.out.println("2. Modify passenger records. ");
            System.out.println("3. Display passenger records.");
            System.out.println("4. Exit. ");
            int choose = input("your choose");
            switch (choose) {
                case 1:
                    reservationId = inputString("reservationId");
                    name = inputString("name");
                    address = inputString("address");
                    phone = inputString("phone");
                    departureDate = inputDate("departure date (dd/mm/yyyy)");
                    returnDate = inputDate("return date (dd/mm/yyyy)");
                    passenger = new Passenger(reservationId, name, address, phone, departureDate, returnDate);
                    reservation.add(passenger);
                    System.out.println("add success");
                    break;
                case 2:
                    reservationId = inputString("reservationId");
                    name = inputString("name");
                    address = inputString("address");
                    phone = inputString("phone");
                    departureDate = inputDate("departure date (dd/mm/yyyy)");
                    returnDate = inputDate("return date (dd/mm/yyyy)");
                    passenger = new Passenger(reservationId, name, address, phone, departureDate, returnDate);
                    iterator = reservation.iterator();
                    while (iterator.hasNext()) {
                        Passenger passengerInQueue = iterator.next();
                        if (passengerInQueue != null && reservationId.equals(passengerInQueue.getReservationId())) {
                            reservation.remove(passengerInQueue);
                            reservation.add(passenger);
                        }
                    }
                    break;
                case 3:
                    iterator = reservation.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().show();
                    }
                    break;
                case 4:
                    loop = false;
                    break;
            }
        }
    }

    public static int input(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input " + str);
        int input = 0;
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a number!");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static String inputString(String str) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input " + str);
        return scanner.nextLine();
    }

    public static Date inputDate(String field) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input " + field + ":");
        String date = scanner.nextLine();
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
            return simpleDateFormat.parse(date);
        } catch (ParseException e) {
            System.out.println("Wrong syntax");
            return inputDate(field);
        }
    }
}