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

    public String getDescription() {
        return "Id: " + id + ", Name: " + name + ", Base Price: $" + basePrice;
    }

    // Default calculation: subclasses may override with specific pricing logic
    public double calculatePrice() {
        return basePrice;
    }

    // Default duration in minutes: subclasses may override
    public int getDurationInMinutes() {
        return 0;
    }
}