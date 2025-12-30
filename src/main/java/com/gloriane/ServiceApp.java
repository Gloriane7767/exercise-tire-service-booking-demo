package com.gloriane;

import java.util.ArrayList;
import java.util.List;

public class ServiceApp {
    public static void main(String[] args) {

        List<Service> services = new ArrayList<>();

       services.add(new WinterTireChange(1, 1000));
         services.add(new SummerTireChange(2, 1000));

          for (Service service : services) {
                System.out.println("Service: " + service.getName());
                System.out.println("Base Price: " + service.getBasePrice());
                System.out.println("Calculated Price: " + service.calculatePrice());
                System.out.println();
          }
    }

}
