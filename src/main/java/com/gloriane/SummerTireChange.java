package com.gloriane;

public class SummerTireChange extends Service {
    // Summer tire change is faster
    private final double price;
    private final int duration;
    private final double seasonalDiscount;

    public SummerTireChange(int id, String name, double basePrice, double price, int duration, double seasonalDiscount) {
        super(id, name, basePrice);
        this.price = price;
        this.duration = duration;
        this.seasonalDiscount = seasonalDiscount;
    }

    @Override
    public double calculatePrice() {
        return price * 0.80; // Apply seasonal discount of 20%
    }

    @Override
    public int getDurationInMinutes() {
        return duration;
    }

    public void getDescription() {
        return;
    }
}
