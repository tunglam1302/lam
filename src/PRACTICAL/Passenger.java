package PRACTICAL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Passenger implements Comparable {
    private String reservationId;
    private String name;
    private String address;
    private String phone;
    private Date departureDate;
    private Date returnDate;


    public Passenger(String reservationId, String name, String address, String phone, Date departureDate, Date returnDate) {
        this.reservationId = reservationId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void show() {
        System.out.println("reservationId: " + reservationId);
        System.out.println("name: " + name);
        System.out.println("address: " + address);
        System.out.println("phone: " + phone);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("departureDate: " + simpleDateFormat.format(departureDate));
        System.out.println("returnDate: " + simpleDateFormat.format(returnDate));
        System.out.println("*********************************************");
    }

    @Override
    public int compareTo(Object o) {
        return reservationId.compareTo(((Passenger) o).getReservationId());
    }
}
