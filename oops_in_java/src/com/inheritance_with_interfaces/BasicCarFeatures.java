package com.inheritance_with_interfaces;

public class BasicCarFeatures implements BasicCar{

    @Override
    public String features() {
        return "Car: Maruti Suzuki 800\n" +
                "Engine: 796cc, 3-cylinder petrol\n" +
                "Power: Approx 37 bhp\n" +
                "Transmission: Manual\n" +
                "Mileage: 16-20 km/l\n" +
                "Seating Capacity: 4-5 persons\n" +
                "Body Type: Hatchback\n" +
                "Drive Type: Front-wheel drive";
    }


    public void display(){
        System.out.println(features());
        System.out.println("====================================");
        System.out.println("------------------------------------");

    }
}
