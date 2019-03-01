package Ass5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList productArrayList = new ArrayList();
        Ao ao1 = new Ao(1,"Áo hàng hiệu",10000,5,"ao",5,"Xanh","May 10");
        Nhan nhan1 = new Nhan(2,"Nhẫn kim cương",100000,5,"nhan",1,"Nhẫn quý");

        Order order = new Order();
        ao1.buyItem(order,3);
        nhan1.buyItem(order,2);
        System.out.println("Danh sách sản phẩm trong đơn hàng:");

        for (int i=0;i<order.productArrayList.size();i++){
            if(order.productArrayList.get(i) instanceof Ao){
                Ao product = (Ao)order.productArrayList.get(i);
                System.out.println(product.productName);
            }else {
                Nhan product = (Nhan) order.productArrayList.get(i);
                System.out.println(product.productName);
            }
        }
        System.out.println("Tổng tiền: "+order.grandTotal);


    }
}