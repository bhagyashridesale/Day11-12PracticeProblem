package com.bridgelabz.stock;

import java.util.Scanner;

public class MainStockAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockAccount stockaccount = new StockAccount();
        System.out.println("Welcome to stock management");
        while (true) {
            System.out.println("Enter the choice: \n1)Enter new stock \n2)Display Stock report " + "\n3)exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> stockaccount.addStocks();
                case 2 -> stockaccount.stockReport();
                case 3 -> {
                    System.out.println("exiting");
                    System.exit(0);
                }
                default -> System.out.println("invalid input");
            }
        }
    }
}
