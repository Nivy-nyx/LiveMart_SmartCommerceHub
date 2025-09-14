package com.livemart;

public class MainApp {
    public static void main(String[] args) {
        Customer c1 = new Customer("C101", "Nivedita", "niv@example.com");
        Retailer r1 = new Retailer("R201", "FreshMart", "retail@freshmart.com");
        Wholesaler w1 = new Wholesaler("W301", "AgroSupply", "supply@agro.com");

        c1.displayInfo();
        r1.displayInfo();
        w1.displayInfo();

        // === Product Test ===
        Product p1 = new Product("P401", "Rice Bag", 550.0, 20, "FreshMart");
        Product p2 = new Product("P402", "Sugar Pack", 120.0, 50, "FreshMart");

        p1.displayInfo();
        p2.displayInfo();

        // === Cart Test ===
        Cart cart1 = new Cart("Cart101", c1);
        cart1.addProduct(p1);
        cart1.addProduct(p2);
        cart1.displayCart();

        cart1.removeProduct(p2);
        cart1.displayCart();
    }
}
