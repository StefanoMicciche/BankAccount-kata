package org.example;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(0);

        account.deposit(500);

        account.withdraw(200);

        System.out.println("Final balance: " + account.getBalance());
    }
}