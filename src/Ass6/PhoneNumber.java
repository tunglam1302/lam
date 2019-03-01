package Ass6;

public class PhoneNumber implements Comparable<PhoneNumber>{

    public String name;
    public String phone;

    public PhoneNumber(String name,String phone){
        this.name = name;
        this.phone = phone;
    }


    @Override
    public int compareTo(PhoneNumber phoneNumber) {
        return this.name.compareTo(phoneNumber.name);
    }
}