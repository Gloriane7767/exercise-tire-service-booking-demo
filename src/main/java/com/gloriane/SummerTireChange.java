package com.gloriane;

public class SummerTireChange extends Service {
    // Summer tire change is faster
    private static final int DURATION = 30;

    public SummerTireChange(int id) {
        super(id, "Summer Tire Change", 60.0);
    }

    // No extra cost
    @Override
    public double calculatePrice() {
        return getBasePrice();
    }

    @Override
    public int getDurationInMinutes() {
        return DURATION;
    }
}

