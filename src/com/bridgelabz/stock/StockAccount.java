package com.bridgelabz.stock;

import com.bridgelabz.stock.Stock;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {
    ArrayList<Stock> arrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public void addStocks() {
        Stock stock = new Stock();
        System.out.println("Enter the stock name");
        stock.setStockNames(scanner.next());

        System.out.println("Enter the Number of shares present");
        stock.setNumberOfShares(scanner.nextInt());

        System.out.println("Enter the share price");
        stock.setSharePrice(scanner.nextDouble());

        // adding object to array list
        arrayList.add(stock);
    }

    public void stockReport() {
        Double sum = 0.0;
        System.out.println(" STOCK REPORT ");
        for (int i = 0; i < arrayList.size(); i++) {
            Stock s = arrayList.get(i);
            double totalPrice = s.getNumberOfShares() * s.getSharePrice();
            totalPrice = sum + totalPrice;
            System.out.println("stock name = " + s.getStockNames() + "\nnumber of shares = " + s.getNumOfShare()
                    + "\nstock price = " + s.getSharePrice() + "\nTotal price of stock = " + totalPrice + "\n");
        }
    }

}