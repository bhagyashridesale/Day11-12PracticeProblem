package com.bridgelabz;

import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the balance to mention in the account");
        Account account = new Account(scanner.nextDouble());
        account.debit(account.balance);
    }

}
