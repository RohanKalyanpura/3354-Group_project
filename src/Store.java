import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;

    public Store() {
        products = new ArrayList<>();
        populateStore();
    }

    private void populateStore() {
        products.add(new Product("Apple", 0.99));
        products.add(new Product("Bread", 2.50));
        products.add(new Product("Milk", 1.49));
        products.add(new Product("Eggs", 3.49));
        products.add(new Product("Cheese", 4.99));
    }

    public List<Product> getProducts() {
        return products;
    }

    public void displayProducts() {
        System.out.println("Available Products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }
    }

    public Product getProduct(int index) {
        if (index >= 0 && index < products.size()) {
            return products.get(index);
        }
        return null;
    }
}
