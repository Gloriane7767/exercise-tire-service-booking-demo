package com.gloriane;

// Winter tire change takes longer
public class WinterTireChange extends Service {

    public WinterTireChange(int id, int basePrice) {
        super(id, "Winter Tire Change", basePrice);
    }

    public double calculatePrice() {
        int storageFee = 200;
        return getBasePrice() + storageFee;
    }

    @Override
    public int getDescription() {
        return 0;
    }
}


