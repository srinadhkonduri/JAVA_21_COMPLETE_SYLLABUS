package com.project.bank.main;

import com.project.bank.bank_service.Service;
import com.project.bank.exception.AccountNotFoundException;
import com.project.bank.exception.InsufficientBalanceException;
import com.project.bank.exception.InvalidAmountException;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        service.createAccount(1, "Srinadh", 1000);

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter amount to withdraw:");
            double amount = sc.nextDouble();

            service.withdraw(1, amount);

            System.out.println("Withdrawal successful!");

        } catch (InvalidAmountException e) {
            System.out.println("Invalid input: " + e.getMessage());

        } catch (InsufficientBalanceException e) {
            System.out.println("Business error: " + e.getMessage());

        } catch (AccountNotFoundException e) {
            System.out.println("Account error: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("File logging failed: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Unexpected error occurred.");

        } finally {
            System.out.println("Transaction completed.");
        }
    }
}
