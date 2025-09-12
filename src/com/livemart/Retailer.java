package com.livemart;

public class Retailer extends User {

    public Retailer(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void displayInfo() {
        System.out.println("Retailer: " + name + " (" + email + ")");
    }
}
