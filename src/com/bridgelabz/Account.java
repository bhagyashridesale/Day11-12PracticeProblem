package com.bridgelabz;

import java.util.Scanner;

public class Account {
    static Scanner scanner = new Scanner(System.in);
    double balance;

    public Account(double balance) {
        super();
        this.balance = balance;
    }

    public void debit(double balance) {
        System.out.println("enter amount to withdraw");
        double withdraw = scanner.nextDouble();
        if (withdraw > balance)
            System.out.println("withdraw exceeds the balance please enter correct amount");
        else
            balance = balance - withdraw;
        System.out.println("Remaining balance is " + balance);

    }


}
