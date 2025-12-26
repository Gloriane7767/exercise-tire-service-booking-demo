package com.gloriane;

// Winter tire change takes longer
public class WinterTireChange extends Service {
    private int duration;

    public WinterTireChange(int id, String name, double basePrice, int duration) {
        super(id, name, basePrice);
        this.duration = duration;
    }

}
