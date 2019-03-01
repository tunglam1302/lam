package Ass4;

import java.util.ArrayList;

public class Order {
    public int ID;
    public int grandTotal = 0;
    public ArrayList<Product> productArrayList = new ArrayList<Product>();

    public void addItem(Product product){
        if(product.getQty() > 0){
            // this.productArrayList = new ArrayList<>();
            this.productArrayList.add(product);
            this.grandTotal += product.price;
            product.setQty(product.getQty()-1);
        }else {
            System.out.println(product.productName + " het hang");
        }
    }

    public void addItem(Product product,int discount){
        if(product.getQty() > 0){
            this.productArrayList.add(product);
            this.grandTotal += product.price * (100-discount)/100;
            product.setQty(product.getQty()-1);
        }else {
            System.out.println(product.productName + " het hang");
        }
    }
}
