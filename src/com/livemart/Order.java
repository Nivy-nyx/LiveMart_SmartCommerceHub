package com.livemart;

public class Order {
    private String orderId;
    private Customer customer;
    private Cart cart;
    private double totalAmount;
    private String status; // e.g., "Pending", "Confirmed", "Delivered"

    // Constructor
    public Order(String orderId, Customer customer, Cart cart) {
        this.orderId = orderId;
        this.customer = customer;
        this.cart = cart;
        this.totalAmount = cart.calculateTotal();
        this.status = "Pending";
    }

    // Place order
    public void placeOrder() {
        System.out.println("Order " + orderId + " placed by " + customer.getName());
        System.out.println("Total amount: ₹" + totalAmount);
        this.status = "Confirmed";
    }

    // Update order status
    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Order " + orderId + " status updated to: " + status);
    }

    // Display order details
    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        cart.displayCart();
        System.out.println("Status: " + status);
    }

    // Getter for amount
    public double getTotalAmount() {
        return totalAmount;
    }
}
