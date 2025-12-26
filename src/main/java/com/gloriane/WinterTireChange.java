package com.gloriane;

// Winter tire change takes longer
public class WinterTireChange extends Service {
    private static final  int DURATION = 45;

    public WinterTireChange(int id) {
        super(id, "Winter Tire Change", 80.0);
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.20;
    }

    @Override
    public int getDurationInMinutes() {
        return DURATION;
    }
}
