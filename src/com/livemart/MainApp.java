package com.livemart;

public class MainApp {
    public static void main(String[] args) {
        Customer c1 = new Customer("C101", "Nivedita", "niv@example.com");
        Retailer r1 = new Retailer("R201", "FreshMart", "retail@freshmart.com");
        Wholesaler w1 = new Wholesaler("W301", "AgroSupply", "supply@agro.com");

        c1.displayInfo();
        r1.displayInfo();
        w1.displayInfo();
    }
}
