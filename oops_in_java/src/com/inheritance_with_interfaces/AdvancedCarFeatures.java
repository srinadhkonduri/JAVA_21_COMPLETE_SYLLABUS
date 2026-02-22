package com.inheritance_with_interfaces;

public class AdvancedCarFeatures implements AdvancedCar{
    @Override
    public String advancedCarFeatures() {

        return "===== BMW X4 (2026) Specifications =====\n" +
                "Model        : BMW X4\n" +
                "Body Type    : Compact Luxury SUV with Coupe-like Roofline\n" +
                "Seating      : 5 Seats\n" +
                "Drive Type   : All-Wheel Drive (AWD)\n" +
                "Transmission : 8-Speed Automatic\n" +
                "Engine       : Turbocharged Petrol (2.0L / optional 3.0L)\n" +
                "Power        : ~252-355 bhp depending on variant\n" +
                "Torque       : ~350-500 Nm\n" +
                "Mileage      : ~10-13 km/l (varies by engine & region)\n" +
                "Top Speed    : ~240-250 km/h\n" +
                "Features     : Panoramic Sunroof, 12.3\" Infotainment, HUD,\n" +
                "               360° Camera, Wireless Apple/Android CarPlay,\n" +
                "               TPMS, Keyless Entry, LED Lights\n";
    }

    @Override
    public String featuresOfIntermediate() {
        return "===== Kia Seltos 2026 Specifications =====\n" +
                "Model        : Kia Seltos 2026\n" +
                "Engine Options:\n" +
                "  1.5L NA Petrol (115PS, 144Nm)\n" +
                "  1.5L Turbo Petrol (160PS, ~250Nm)\n" +
                "  1.5L Diesel (116PS, ~250Nm)\n" +
                "Transmission : 6MT / CVT / 7DCT / 6AT depending on engine\n" +
                "Seating      : 5 seats\n" +
                "Body Type    : Compact SUV\n" +
                "Infotainment : 10.25\" Touchscreen + 10.25\" Driver Display\n" +
                "Comfort      : Dual-zone climate control, ventilated seats, panoramic sunroof\n" +
                "Safety       : 6 airbags, ABS+EBD, ESC, TPMS, ADAS Level 2+\n" +
                "Connectivity : Wireless Android Auto/Apple CarPlay, connected car tech\n" +
                "Dimensions   : Spacious interior & generous boot space\n";
    }

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
        System.out.println(featuresOfIntermediate());
        System.out.println(advancedCarFeatures());
        System.out.println("====================================");
        System.out.println("------------------------------------");

    }
}
