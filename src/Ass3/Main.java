package Ass3;

public class Main {
    public static void main(String[] args){
        Dog Dog1 = new Dog(1,"A","red",10,1);
        Cat Cat1 =  new Cat(1,"a","blue",4,2);
        if (Dog1.weight>Cat1.weight){
            System.out.println("cho can va duoi meo  chay");
        }
        else {
            System.out.println("meo cao cho");
        }
    }
}
