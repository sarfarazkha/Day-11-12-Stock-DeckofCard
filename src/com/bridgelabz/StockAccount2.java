package com.bridgelabz;

/*PROBLEM STATEMENT
 * Stock Account Management
 * Get i/p from user about stock name ,price per stock
 * & no of stocks and store the information and display
 * as per user choice.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount2 {
    // Array list of stock account
    ArrayList<StockAccount1> list = new ArrayList<>();
    // object of scanner class for user input
    Scanner sc = new Scanner(System.in);

    private void setStocks() {
        System.out.println("Enter the Number of Stock Accounts You Want To Have : ");
        int no = sc.nextInt();
        for (int i = 0; i < no; i++) {
            StockAccount1 stockAccount = new StockAccount1();
            setStockInfo(stockAccount, i);
        }
    }

    private void setStockInfo(StockAccount1 stockAccount, int i) {
        System.out.println("Enter the Stock " + (i + 1) + " Information :");
        System.out.println("Enter the Stock Name :");
        stockAccount.setStockNames(sc.next());
        System.out.println("Enter the Number of Shares :");
        stockAccount.setNumOfShares(sc.nextInt());
        System.out.println("Enter the Price of each Share :");
        stockAccount.setSharePrices(sc.nextDouble());
        stockAccount.setTotalValueOfShares(stockAccount.getNumOfShares(), stockAccount.getSharePrices());
        list.add(stockAccount);
    }

    private void getStockInfo() {
        int i = 1;
        for (StockAccount1 stockAccount : list) {
            System.out.println("Stock " + i + " Information is :");
            System.out.println("Stock Name : " + stockAccount.getStockNames());
            System.out.println("Number of Shares : " + stockAccount.getNumOfShares());
            System.out.println("Price of each Shares : " + stockAccount.getSharePrices());
            System.out.println("Total Value of Shares : " + stockAccount.getTotalValueOfShares());
            i++;
        }
    }

    public static void main(String[] args) {
        StockAccount2 stockPortfolio = new StockAccount2();
        stockPortfolio.setStocks();
        stockPortfolio.getStockInfo();
    }
}
