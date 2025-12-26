package com.gloriane;

public class Main {
    public static void main(String[] args) {
        Service summerService = new SummerTireChange(1, "Winter Tire Change", 100.0, 70.0, 30);
        Service winterService = new WinterTireChange(2, "Winter Tire Change", 120.0, 80.0, 45);

        System.out.println("Id: " + summerService.getId() + " " + summerService.getName() + ": $" + summerService.calculatePrice() +
                ", Duration: " + summerService.getDurationInMinutes() + " mins");


















































































        System.out.println("Id: " + winterService.getId() + " " + winterService.getName() + ": $" + winterService.calculatePrice() +
                ", Duration: " + winterService.getDurationInMinutes() + " mins");
    }

}
