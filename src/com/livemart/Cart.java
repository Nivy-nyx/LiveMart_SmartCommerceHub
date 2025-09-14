package com.livemart;

import java.util.ArrayList;

public class Cart {
    private String cartId;
    private Customer customer;
    private ArrayList<Product> products;

    // Constructor
    public Cart(String cartId, Customer customer) {
        this.cartId = cartId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    // Add product to cart
    public void addProduct(Product p) {
        products.add(p);
        System.out.println(p.getName() + " added to cart.");
    }

    // Remove product from cart
    public void removeProduct(Product p) {
        if (products.remove(p)) {
            System.out.println(p.getName() + " removed from cart.");
        } else {
            System.out.println(p.getName() + " not found in cart.");
        }
    }

    // Calculate total price
    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    // Display cart contents
    public void displayCart() {
        System.out.println("Cart for " + customer.getName() + ":");
        for (Product p : products) {
            p.displayInfo();
        }
        System.out.println("Total: ₹" + calculateTotal());
    }
}

