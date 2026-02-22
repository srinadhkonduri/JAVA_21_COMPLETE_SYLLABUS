package com.interfaces;

import java.util.Scanner;

public class MainClass {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HDFCBankLoan hdfcBankLoan = new HDFCBankLoan();
        ICICIBankLoan iciciBankLoan = new ICICIBankLoan();
        System.out.println("welcome to the loan calculator :");
        boolean start = true;

        while (start){
            System.out.println("Enter 1 for HDFC loan calculation :");
            System.out.println("Enter 2 for ICICI loan calculation :");
            System.out.println("Enter 0 for exit : ");

            int option = scanner.nextInt();

            switch (option){
                case 1:
                    hdfcBankLoan.finalAMountToBePaid();
                    break;
                case 2:
                    iciciBankLoan.finalAMountToBePaid();
                    break;
                case 0:
                    System.out.println("thank you ...");
                    start = false;
                    break;
                default:
                    System.out.println("enter correct options for using us");
            }
        }
    }

}
