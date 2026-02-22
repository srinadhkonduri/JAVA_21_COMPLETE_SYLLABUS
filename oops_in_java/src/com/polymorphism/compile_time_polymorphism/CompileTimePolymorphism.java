package com.polymorphism.compile_time_polymorphism;

import java.util.Scanner;

public class CompileTimePolymorphism {

    public void makePayment(){
        System.out.println("payment done ...");
    }

    public String makePayment(double amount){
        return "amount payed : " + amount;
    }

    public void makePayment(String paymentType, double amount){
        System.out.println(paymentType + " " + amount);
    }

    public static void main(String[] args) {
        double amount;
        Scanner scanner = new Scanner(System.in);
        CompileTimePolymorphism polymorphism = new CompileTimePolymorphism();
        System.out.println("Welcome to payment system :");
        while (true){

            System.out.println("Enter 1 for normal payment ");
            System.out.println("Enter 2 for only amount payment ");
            System.out.println("Enter 3 for payment type and amount");
            System.out.println("Enter 0  for exit ");

            int option = scanner.nextInt();

            if (option == 0){
                System.out.println("thank you");
                break;
            }

            switch (option){
                case 1:
                    polymorphism.makePayment();
                    break;
                case 2:
                    System.out.println("Enter the amount :");
                    amount = scanner.nextDouble();
                    System.out.println(polymorphism.makePayment(amount));;
                    break;
                case 3:
                    System.out.println("Enter the payment type :");
                    String type = scanner.next();
                    System.out.println("Enter the amount :");
                    amount = scanner.nextDouble();
                    polymorphism.makePayment(type,amount);
                    break;
                default:
                    System.out.println("Enter correct option ... ");
            }

        }
    }
}
