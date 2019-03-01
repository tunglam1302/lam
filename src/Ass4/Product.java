package Ass4;

public class Product {
    public int ID;
    public String productName;
    public int price;
    private int qty;

    public Product(int ID,String productName,int price,int qty){
        this.ID = ID;
        this.productName = productName;
        this.price = price;
        this.qty = qty;
    }

    public int getQty(){
        return this.qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }
}
