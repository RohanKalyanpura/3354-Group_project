import java.util.List;

public class Order {
    private List<Product> products;
    private double totalAmount;

    public Order(List<Product> products) {
        this.products = products;
        this.totalAmount = calculateTotalAmount();
    }

    private double calculateTotalAmount() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("Order Summary:");
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println("Total Amount: $" + totalAmount);
    }
}
