package com.livemart;

public class Product {
    private String productId;
    private String name;
    private double price;
    private int stock;
    private String seller;

    // Constructor
    public Product(String productId, String name, double price, int stock, String seller) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.seller = seller;
    }

    // Getters
    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }
    public String getSeller() { return seller; }

    // Update stock after a sale
    public void updateStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            System.out.println(quantity + " units of " + name + " sold. Remaining stock: " + stock);
        } else {
            System.out.println("Not enough stock for " + name);
        }
    }

    // Display product info
    public void displayInfo() {
        System.out.println("Product: " + name + " | Price: ₹" + price + " | Stock: " + stock + " | Seller: " + seller);
    }
}

