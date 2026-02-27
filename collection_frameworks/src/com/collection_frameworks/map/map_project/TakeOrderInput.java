package com.collection_frameworks.map.map_project;

import java.util.Scanner;

public class TakeOrderInput {
    static Scanner scanner = new Scanner(System.in);
    public OrderInfo takeOrderInput(Scanner scanner){
        OrderInfo orderInfo = new OrderInfo();
        System.out.println("Welcome to order info : ");
        System.out.println("Enter the order id : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter customer id : ");
        String cusId = scanner.nextLine();

        System.out.println("Enter cus name : ");
        String name = scanner.nextLine();

        System.out.println("Enter the cus address : ");
        String address = scanner.nextLine();

        System.out.println("Enter cus phone : ");
        String phone = scanner.nextLine();

        System.out.println("Enter the cus email : ");
        String email = scanner.nextLine();


        orderInfo.setOrderId(id);
        orderInfo.setCustomerId(cusId);
        orderInfo.setCustomerName(name);
        orderInfo.setCustomerAddress(address);
        orderInfo.setCustomerEmail(email);
        orderInfo.setCustomerPhone(phone);

        return orderInfo;
    }
}
