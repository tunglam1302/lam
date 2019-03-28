package PRACTICAL;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ManagementSystem {
    private PriorityQueue<Reservation> list;

    public ManagementSystem() {
        this.list = new PriorityQueue<>();
    }
    public boolean add(Reservation r) {
        Iterator<Reservation> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (r.getReservationID() == iterator.next().getReservationID()) {
                System.out.println("ReservationID has exist");
                return false;
            }
        }
        list.add(r);
        return true;
    }
    public void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input ID:  ");
        int id = scanner.nextInt();
        Iterator<Reservation> iterator = list.iterator();
        while (iterator.hasNext()){
            if(id == iterator.next().getReservationID()) {
                System.out.println("Update reservation for ID = " + id);
                System.out.println("PassengerName: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                System.out.println("Address ");
                String address = scanner.nextLine();
                System.out.println("Phone: ");
                String phone = scanner.nextLine();
                System.out.println("Date departure: ");
                String date_departure = scanner.nextLine();
                System.out.println("Date return: ");
                String date_return = scanner.nextLine();
                iterator.remove();
                list.add(new Reservation(id, name, address, phone, date_departure,date_return));
                return;
            }

        }
        System.out.println("Not found");
    }

    public void display() {
        Iterator<Reservation> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

}
