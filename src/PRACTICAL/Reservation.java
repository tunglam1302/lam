package PRACTICAL;
import java.util.Date;

public class Reservation {
    private int ReservationID;
    private String PassengerName;
    private String address;
    private String phone;
    private String date_departure;
    private String date_return;

    public Reservation(int reservationID, String passengerName, String address, String phone, String date_departure, String date_return) {
        ReservationID = reservationID;
        PassengerName = passengerName;
        this.address = address;
        this.phone = phone;
        this.date_departure = date_departure;
        this.date_return = date_return;
    }

    public int getReservationID() {
        return ReservationID;
    }

    public void setReservationID(int reservationID) {
        ReservationID = reservationID;
    }

    public String getPassengerName() {
        return PassengerName;
    }

    public void setPassengerNam(String passengerName) {
        PassengerName = passengerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate_departure() {
        return date_departure;
    }

    public void setDate_departure(String date_departure) {
        this.date_departure = date_departure;
    }

    public String getDate_return() {
        return date_return;
    }

    public void setDate_return(String date_return) {
        this.date_return = date_return;
    }

    @Override
    public String toString() {
        return ReservationID + " " + PassengerName + " " + address + " " + date_departure + " " + date_return;
    }
}
