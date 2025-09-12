package com.livemart;

public abstract class User {
    protected String id;
    protected String name;
    protected String email;

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public abstract void displayInfo();

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}
