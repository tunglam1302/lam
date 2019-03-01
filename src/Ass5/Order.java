package Ass5;

import java.util.ArrayList;

public class Order {
    public int ID;
    public int grandTotal;
    public ArrayList productArrayList;

    public Order(){
        this.grandTotal = 0;
        this.productArrayList = new ArrayList();
    }

    public void buyItem(Product product,int qty){
        this.grandTotal += qty * product.price;
        product.qty--;
        this.productArrayList.add(product);
    }
}
