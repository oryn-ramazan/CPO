import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Show Products");
            System.out.println("3. Remove Product");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Quantity: ");
                int quantity = sc.nextInt();

                warehouse.addProduct(new Product(id, name, quantity));

            } else if (choice == 2) {
                warehouse.showProducts();

            } else if (choice == 3) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                warehouse.removeProduct(id);

            } else {
                break;
            }
        }
    }
}