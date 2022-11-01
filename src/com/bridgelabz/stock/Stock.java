package com.bridgelabz.stock;

public class Stock {
    private String stockNames;
    private int numberOfShares;
    private Double sharePrice;

    public Stock() {
        super();
    }

    public Stock(String stockNames, int numberOfShares, Double sharePrice) {
        super();
        this.stockNames = stockNames;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    public String getStockNames() {
        return stockNames;
    }

    public void setStockNames(String stockNames) {
        this.stockNames = stockNames;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public Double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(Double sharePrice) {
        this.sharePrice = sharePrice;
    }
            public Double getNumOfShare(){
        return null;
    }
}
