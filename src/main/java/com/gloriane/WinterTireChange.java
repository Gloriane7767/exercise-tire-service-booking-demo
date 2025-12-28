package com.gloriane;

// Winter tire change takes longer
public class WinterTireChange extends Service {
    private final double price;
    private final int duration;
    private final double storageFee;

    public WinterTireChange(int id, String name, double basePrice, double price, int duration, double storageFee) {
        super(id, name, basePrice);
        this.price = price;
        this.duration = duration;
        this.storageFee = storageFee;
    }

    @Override
    public double calculatePrice() {
        return price + 60; // Add storage fee for winter tires
    }

    @Override
    public int getDurationInMinutes() {
        return duration;
    }

    @Override
    public void getDescription() {
        return;
    }
}
