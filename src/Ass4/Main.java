package Ass4;

public class Main {
    public static void main(String[] args){
        Product product1 = new Product(1,"sp 1",1000,5);
        Product product2 = new Product(2,"sp 2",2000,2);
        Product product3 = new Product(3,"sp 3",3000,0);
        Order order = new Order();
        order.addItem(product1);
        order.addItem(product2,20);
        order.addItem(product3);
        System.out.println("danh sach san pham:");
        for (Product sp:order.productArrayList){
            System.out.println(sp.productName+" -- con lai:"+ sp.getQty());
        }
        System.out.println("tong tien don hang:");
        System.out.println(order.grandTotal);

    }
}
