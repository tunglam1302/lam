package Practical;

public class Item {
    public int itemId;
    public String name;
    public String producer;
    public double price;

    public Item(int itemId, String name, String producer, double price) {
        this.itemId = itemId;
        this.name = name;
        this.producer = producer;
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String toString(){
        String inf;
        inf =" ID:" + itemId + " Name:" +name + " producer :" + producer + " price:" +price;
        return inf;
    }
}

