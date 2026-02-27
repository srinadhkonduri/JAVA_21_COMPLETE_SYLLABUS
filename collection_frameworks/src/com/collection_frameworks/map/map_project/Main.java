package com.collection_frameworks.map.map_project;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        TakeOrderInput orderInput = new TakeOrderInput();
        Map<Integer, OrderInfo> orderInfoMap = new HashMap<>();

        System.out.println("Enter how many orders you want : ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.println("Enter the customer details of : " + (i+1));
            OrderInfo orderInfo =  orderInput.takeOrderInput(scanner);


            // this is the most important step in the entire program
            orderInfoMap.put(orderInfo.getOrderId(),orderInfo);
        }




        // Printing all details properly
        System.out.println("-------- ALL ORDERS --------");

        for (Map.Entry<Integer, OrderInfo> entry : orderInfoMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        scanner.close();
    }
}
