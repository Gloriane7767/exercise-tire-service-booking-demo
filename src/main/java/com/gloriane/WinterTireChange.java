package com.gloriane;

// Winter tire change takes longer
public class WinterTireChange extends Service {
    private final double price;
    private final int duration;

    public WinterTireChange(int id, String name, double basePrice, double price, int duration) {
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

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
