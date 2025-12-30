package com.gloriane;

public class SummerTireChange extends Service {

    public SummerTireChange(int id, int basePrice) {
        super(id, "Summer Tire Chane", basePrice);
    }

    public double calculatePrice() {
        int discount = 150;
        return getBasePrice() - discount;
    }

    @Override
    public int getDescription() {
        return 0;
    }
}
