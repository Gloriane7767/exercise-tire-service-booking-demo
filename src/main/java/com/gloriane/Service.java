package com.gloriane;

// 1️⃣ Abstract Parent Class: Service
public abstract class Service {

    // These variables belong to ALL services. Inheritance.Different services share common things
    //So we put shared things in a parent class
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

    public abstract int  getDescription(); //Add Abstract method to Service: must be implemented by child classes

    public double calculatePrice() {
        return basePrice;
    }
}

/*
🟦 EXERCISE 1 — INHERITANCE
Goal (Simple Words)

Different services share common things
So we put shared things in a parent class
abstract means:
“You cannot create a Service directly”
This class exists only to be extended
It holds shared data

🟨 EXERCISE 2 — POLYMORPHISM
Goal (Simple Words)

Same method name
Different behavior
Based on object typ
Parent says:
“Every service MUST know how to calculate its price”
Parent does not know how

This is runtime polymorphism
 */