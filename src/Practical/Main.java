package Practical;

        import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Input item details");
        Scanner scanner = new Scanner(System.in);
        System.out.println("input item id :");
        int itemId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("input item name");
        String name = scanner.nextLine();
        System.out.println("input producer");
        String producer = scanner.nextLine();
        System.out.println("input price");
        double price = scanner.nextDouble();
        scanner.nextLine();
        Item item = new Item(itemId,name,producer,price);
        System.out.println("info: " +item.toString());
    }
}
