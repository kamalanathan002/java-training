import java.util.*;
class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
class Cart {
    List<Product> items = new ArrayList<>();
    void addProduct(Product p) {
        items.add(p);
        System.out.println(p.name + " added to cart.");
    }
    void removeProduct(int id) {
        Iterator<Product> it = items.iterator();
        boolean found = false;
        while (it.hasNext()) {
            Product p = it.next();
            if (p.id == id) {
                it.remove();
                System.out.println(p.name + " removed from cart.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }
    }
    void viewCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("Cart Items:");
        for (Product p : items) {
            System.out.println(p.id + " - " + p.name + " - ₹" + p.price);
        }
    }
    void getTotal() {
        double total = 0;
        for (Product p : items) {
            total += p.price;
        }
        System.out.println("Total Price: ₹" + total);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();
        Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Phone", 20000);
        Product p3 = new Product(3, "Headphones", 2000);
        while (true) {
            System.out.println("\n1.Add 2.Remove 3.View 4.Total 5.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Choose product: 1.Laptop 2.Phone 3.Headphones");
                    int ch = sc.nextInt();
                    if (ch == 1) cart.addProduct(p1);
                    else if (ch == 2) cart.addProduct(p2);
                    else if (ch == 3) cart.addProduct(p3);
                    else System.out.println("Invalid choice");
                    break;
                case 2:
                    System.out.println("Enter product id to remove:");
                    int id = sc.nextInt();
                    cart.removeProduct(id);
                    break;
                case 3:
                    cart.viewCart();
                    break;
                case 4:
                    cart.getTotal();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}