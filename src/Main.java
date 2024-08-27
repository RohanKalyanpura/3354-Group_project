import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Store store = new Store();
        ShoppingCart cart = new ShoppingCart();
        UserInputHandler inputHandler = new UserInputHandler(scanner, store, cart);

        System.out.println("Welcome to the Interactive Grocery Store!");

        boolean running = true;
        while (running) {
            inputHandler.displayMenu();
            int choice = inputHandler.getChoice();
            running = inputHandler.handleUserChoice(choice);
        }

        scanner.close();
        System.out.println("Thank you for shopping with us!");
    }
}
