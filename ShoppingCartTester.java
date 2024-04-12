package java_assignment_3;

import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart {
    private ArrayList<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added to the cart: " + product.getName());
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Product product : products) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }

    public void displayCartContents() {
        System.out.println("Contents of the cart:");
        for (Product product : products) {
            System.out.println("Product: " + product.getName() + ", Price: " + product.getPrice());
        }
    }
}

public class ShoppingCartTester {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Headphones", 50);

        cart.addProduct(product1);
        cart.addProduct(product2);

        cart.displayCartContents();

        double totalCost = cart.calculateTotalCost();
        System.out.println("Total cost: " + totalCost);
    }
}
