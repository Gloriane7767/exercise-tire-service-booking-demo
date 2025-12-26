package com.gloriane;

public abstract class Service {
    // These variables belong to ALL services
    private int id;
    private String name;
    private double basePrice;


    // Constructor: used when a child class is created
    public Service(int id, String name, double basePrice) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
    }

    // Getters: allow safe access to private data
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    // Every service MUST tell its price
    public abstract double calculatePrice();

    // Every service MUST tell how long it takes
    public abstract int getDurationInMinutes();
}