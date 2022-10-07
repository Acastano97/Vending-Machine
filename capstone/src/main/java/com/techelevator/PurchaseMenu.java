package com.techelevator;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

public class PurchaseMenu {
    MoneyBank fm = new MoneyBank();
    private BigDecimal startingBalance = new BigDecimal("0.00");
    private String[] displayPurchaseOptions;
    private BigDecimal feedBalance = new BigDecimal("0.00");

    public String[] getDisplayPurchaseOptions(Map<String, Item> inventory) {


        String[] displayPurchaseOptions = {"(1) Feed Money", "(2) Select Product", "(3) Finish Transaction"};
        while (true) {

            System.out.println("Current balance is $" + fm.getBalance());

            for (int i = 0; i < displayPurchaseOptions.length; i++) {
                System.out.println(displayPurchaseOptions[i]);
            }

            Scanner userInput = new Scanner(System.in);
            System.out.println("Please choose a menu option: ");
            String PurchaseMenuChoice = userInput.nextLine();
            int purchaseChoice = Integer.parseInt(PurchaseMenuChoice);
            if (purchaseChoice == 1) {
                feedMoney();
            } else if (purchaseChoice == 2) {
                ProductSelector ps = new ProductSelector();
                displayInventory(inventory);
                ps.getProductSelection(inventory);
            } else if (purchaseChoice == 3) {
                break;
            }
        }
        return displayPurchaseOptions;
    }

    private void displayInventory(Map<String, Item> inventory) {

//        for each item in the inventory
//                print it out to the console

        for (String key : inventory.keySet()) {
            Item shortItem = inventory.get(key);
            System.out.println(shortItem.getLocations() + " | " + shortItem.getItemNames() + " | " + shortItem.getItemPrices() + " | " + shortItem.getItemTypes() + " | " + shortItem.getItemCount());
        }
    }
    public void feedMoney() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the amount of money you would like to add: ");
        String moneyAddedStr = userInput.nextLine();
        BigDecimal moneyAdded = new BigDecimal(moneyAddedStr);
        this.fm.addMoney(moneyAdded);
    }
}
