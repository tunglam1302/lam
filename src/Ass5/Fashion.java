package Ass5;

public class Fashion extends Product {
    public int size;
    public String color;
    public String brand;

    public Fashion(int ID, String productName, int price, int qty, String productType, int size,
                   String color, String brand) {
        super(ID, productName, price, qty, productType);
        this.size = size;
        this.color = color;
        this.brand = brand;
    }

    public void giat() {
        System.out.println("Giặt...");
    }

    public void lamKho() {
        System.out.println("Làm khô...");
    }
}