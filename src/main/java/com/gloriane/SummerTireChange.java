package com.gloriane;

public class SummerTireChange extends Service {
    // Summer tire change is faster
    private final double price;
    private final int duration;

    public SummerTireChange(int id, String name, double basePrice, double price, int duration) {
        super(id, name, basePrice);
        this.price = price;
        this.duration = duration;
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    @Override
    public int getDurationInMinutes() {
        return duration;
    }

    public String getDescription() {
        return super.getDescription();
    }
}
