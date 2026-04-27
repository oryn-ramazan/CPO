public class Product {
    int id;
    String name;
    int quantity;

    public Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Quantity: " + quantity);
    }
}