package Ass3;

public class Cat {
    public int ID;
    public String type;
    public String color;
    public int weight;
    public int age;

    public Cat(int ID,String type,String color,int weight,int age){
        this.ID = ID;
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    public void cao(){
        System.out.println("Cao...");
    }

    public void an(){
        System.out.println("An...");
    }

    public void chay(){
        System.out.println("Chay...");
    }
}
