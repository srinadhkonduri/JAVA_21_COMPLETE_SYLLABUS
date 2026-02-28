package com.methods.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        // generate OTP values
        // i/p -> null , o/p -> int
        Supplier<Integer> integerSupplier = () -> new Random().nextInt(1000,9999);
        System.out.println(integerSupplier.get());

        // generate Unique id


    }
}
