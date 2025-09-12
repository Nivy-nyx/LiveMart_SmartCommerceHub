package com.livemart;

public class Customer extends User {

    public Customer(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void displayInfo() {
        System.out.println("Customer: " + name + " (" + email + ")");
    }
}
