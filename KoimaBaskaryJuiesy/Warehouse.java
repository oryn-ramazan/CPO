import java.util.ArrayList;

public class Warehouse {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showProducts() {
        for (Product p : products) {
            p.display();
        }
    }

    public void removeProduct(int id) {
        products.removeIf(p -> p.id == id);
    }
}