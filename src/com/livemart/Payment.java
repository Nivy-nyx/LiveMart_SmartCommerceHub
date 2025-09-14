package com.livemart;

public class Payment {
    private String paymentId;
    private Order order;
    private double amount;
    private String mode;   // "Cash" or "Online"
    private String status; // "Pending", "Success", "Failed"

    // Constructor
    public Payment(String paymentId, Order order, String mode) {
        this.paymentId = paymentId;
        this.order = order;
        this.amount = order.getTotalAmount();
        this.mode = mode;
        this.status = "Pending";
    }

    // Process payment
    public void processPayment(boolean success) {
        if (success) {
            this.status = "Success";
            System.out.println("Payment " + paymentId + " of ₹" + amount + " via " + mode + " was successful.");
        } else {
            this.status = "Failed";
            System.out.println("Payment " + paymentId + " of ₹" + amount + " via " + mode + " failed.");
        }
    }

    // Display payment details
    public void displayPayment() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Order ID: " + order);
        System.out.println("Amount: ₹" + amount);
        System.out.println("Mode: " + mode);
        System.out.println("Status: " + status);
    }

    // Getter for status
    public String getStatus() {
        return status;
    }
}

