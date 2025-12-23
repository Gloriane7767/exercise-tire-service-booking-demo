package com.gloriane;

public abstract class Service {

    protected int id;
    protected String name;
    protected double basePrice;

    public Service(int id, String name, double basePrice) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }