package com.livemart;

public class Wholesaler extends User {

    public Wholesaler(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void displayInfo() {
        System.out.println("Wholesaler: " + name + " (" + email + ")");
    }
}
