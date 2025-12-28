package com.gloriane;

import java.util.List;
import java.util.ArrayList;

public abstract class Service {
    // These variables belong to ALL services
    private int id;
    private String name;
    private double basePrice;
    private List<Service> services;


    // Constructor: used when a child class is created
    public Service(int id, String name, double basePrice) {
        this.id = id;
        this.name = name;
        this.services = new ArrayList<>();
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

    public abstract void getDescription();

    // Default calculation: subclasses may override with specific pricing logic
    public double calculatePrice() {
        return basePrice;
    }

    // Default duration in minutes: subclasses may override
    public int getDurationInMinutes() {
        return 0;
    }
}