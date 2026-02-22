

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account {

    private final long accountNumber;
    private BigDecimal balance;

    public Account(long accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = BigDecimal.ZERO;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Deposit must be positive.");
        }
        balance = balance.add(amount);
    }

    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Withdrawal must be positive.");
        }

        if (balance.compareTo(amount) < 0) {
            throw new IllegalArgumentException("Insufficient funds.");
        }

        balance = balance.subtract(amount);
    }
}

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Map<Long, Account> accounts = new HashMap<>();

    public static void main(String[] args) {

        boolean running = true;

        while (running) {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    createAccount();
                    break;

                case 2:
                    deposit();
                    break;

                case 3:
                    withdraw();
                    break;

                case 4:
                    checkBalance();
                    break;

                case 0:
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }

    static void createAccount() {

        System.out.println("Enter new account number:");
        long accNo = scanner.nextLong();

        if (accounts.containsKey(accNo)) {
            System.out.println("Account already exists.");
            return;
        }

        accounts.put(accNo, new Account(accNo));
        System.out.println("Account created successfully.");
    }

    static Account getAccount() {

        System.out.println("Enter account number:");
        long accNo = scanner.nextLong();

        Account account = accounts.get(accNo);

        if (account == null) {
            System.out.println("Account not found.");
        }

        return account;
    }

    static void deposit() {

        Account account = getAccount();
        if (account == null) return;

        System.out.println("Enter amount:");
        BigDecimal amount = scanner.nextBigDecimal();

        try {
            account.deposit(amount);
            System.out.println("Deposit successful.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // writing a method for withdrawing money from the account
    static void withdraw() {

        Account account = getAccount();
        if (account == null) return;

        System.out.println("Enter amount:");
        BigDecimal amount = scanner.nextBigDecimal();

        try {
            account.withdraw(amount);
            System.out.println("Withdrawal successful.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // writing a method for checking the balance in the bank account
    // it only gives the money remaining in the account

    static void checkBalance() {

        Account account = getAccount();
        if (account == null) return;

        System.out.println("Balance: ₹" + account.getBalance());
    }
}
