package com.application;

public class TypeCastingNonPrimitive {

    public static void main(String[] args) {
        BankApplication bankApplication = new BankApplication();
        ICICIApplication iciciApplication = new ICICIApplication();


        // larger to smaller
        iciciApplication = (ICICIApplication) bankApplication;
        System.out.println(iciciApplication.bankName);
        System.out.println(iciciApplication.name);


        // smaller to larger
        bankApplication = iciciApplication;
        System.out.println(bankApplication.name);
    }
}
