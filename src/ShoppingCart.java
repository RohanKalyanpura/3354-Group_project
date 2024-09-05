import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> cartItems;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cartItems.add(product);
        System.out.println(product.getName() + " has been added to your cart.");
    }

    public void removeProduct(int index) {
        if (index >= 0 && index < cartItems.size()) {
            Product removed = cartItems.remove(index);
            System.out.println(removed.getName() + " has been removed from your cart.");
        } else {
            System.out.println("Invalid item index.");
        }
    }

    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Your Cart:");
            for (int i = 0; i < cartItems.size(); i++) {
                System.out.println((i + 1) + ". " + cartItems.get(i));
            }
        }
    }

    public Order checkout() {
        Order order = new Order(new ArrayList<>(cartItems));
        cartItems.clear();
        return order;
    }
}
