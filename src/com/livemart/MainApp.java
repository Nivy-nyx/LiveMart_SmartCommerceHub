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
        p1.displayInfo();
        p1.updateStock(5);   // sell 5 units
        p1.updateStock(18);  // try to sell more than available
    }
}

