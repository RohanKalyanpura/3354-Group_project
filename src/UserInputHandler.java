import java.util.Scanner;

public class UserInputHandler {
    private Scanner scanner;
    private Store store;
    private ShoppingCart cart;

    public UserInputHandler(Scanner scanner, Store store, ShoppingCart cart) {
        this.scanner = scanner;
        this.store = store;
        this.cart = cart;
    }

    public void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. View Products");
        System.out.println("2. Add Product to Cart");
        System.out.println("3. View Cart");
        System.out.println("4. Remove Product from Cart");
        System.out.println("5. Checkout");
        System.out.println("6. Exit");
    }

    public int getChoice() {
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public boolean handleUserChoice(int choice) {
        switch (choice) {
            case 1:
                store.displayProducts();
                break;
            case 2:
                addProductToCart();
                break;
            case 3:
                cart.displayCart();
                break;
            case 4:
                removeProductFromCart();
                break;
            case 5:
                checkout();
                break;
            case 6:
                return false;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
        return true;
    }

    private void addProductToCart() {
        store.displayProducts();
        System.out.print("Enter the product number to add to cart: ");
        int productIndex = scanner.nextInt() - 1;
        Product product = store.getProduct(productIndex);
        if (product != null) {
            cart.addProduct(product);
        } else {
            System.out.println("Invalid product number.");
        }
    }

    private void removeProductFromCart() {
        cart.displayCart();
        System.out.print("Enter the item number to remove from cart: ");
        int itemIndex = scanner.nextInt() - 1;
        cart.removeProduct(itemIndex);
    }

    private void checkout() {
        Order order = cart.checkout();
        order.displayOrder();
        System.out.println("Thank you for your purchase!");
    }
}
