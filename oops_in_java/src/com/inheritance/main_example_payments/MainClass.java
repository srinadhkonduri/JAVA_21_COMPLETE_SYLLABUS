package com.inheritance.main_example_payments;

import java.util.Scanner;

public class MainClass {


    public static void main(String[] args) {
        FlipKart flipKart = new FlipKart();
        Amazon amazon = new Amazon();
        Meesho meesho = new Meesho();
        Ajio ajio = new Ajio();
        Scanner scanner = new Scanner(System.in);

        boolean start = true;

        while (start){

            System.out.println("WELCOME TO SHOPPING :");
            System.out.println("Enter 0 for exiting :");
            System.out.println("Enter 1 for flipkart :");
            System.out.println("Enter 2 for amazon :");
            System.out.println("Enter 3 for meesho :");
            System.out.println("Enter 4 for A jio :");


            int option = scanner.nextInt();

            switch (option){
                case 1:
                    flipKart.flipkartPayment();
                    break;
                case 2:
                    amazon.AmazonPayment();
                    break;
                case 3:
                    meesho.meeshoPayment();
                    break;
                case 4:
                    ajio.aJioPayment();
                    break;
                case 0:
                    System.out.println("thank you for using our app :");
                    start = false;
                    break;
                default:
                    System.out.println("invalid pleae choose correct options");
            }
        }
    }
}
