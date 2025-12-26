package com.gloriane;

public class SummerTireChange extends Service {
    // Summer tire change is faster
    private int duration;

    public SummerTireChange(int id, String name, double basePrice, int duration) {
        super(id, name, basePrice);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
