package com.techelevator;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;

public class PurchaseMenu {
    MoneyBank mb = new MoneyBank();
    ProductSelector ps = new ProductSelector();
    Item item = new Item();
    private BigDecimal startingBalance = new BigDecimal("0.00");
    private String[] displayPurchaseOptions;
    private BigDecimal feedBalance = new BigDecimal("0.00");

    public String[] getDisplayPurchaseOptions(Map<String, Item> inventory) {


        String[] displayPurchaseOptions = {"(1) Feed Money", "(2) Select Product", "(3) Finish Transaction"};
        while (true) {
            {
                {
                    System.out.println("Current balance is $" + mb.getBalance());


                    for (int i = 0; i < displayPurchaseOptions.length; i++) {
                        System.out.println(displayPurchaseOptions[i]);
                    }

                    Scanner userInput = new Scanner(System.in);
                    System.out.println("Please choose a menu option: ");
                    String PurchaseMenuChoice = userInput.nextLine();
                    int purchaseChoice = Integer.parseInt(PurchaseMenuChoice);
                    if (purchaseChoice == 1) {

                        System.out.println("Please enter the amount of money you would like to add: ");
                        String moneyAddedStr = userInput.nextLine();
                        BigDecimal moneyAdded = new BigDecimal(moneyAddedStr);
                        mb.addMoney(moneyAdded);
                    } else if (purchaseChoice == 2) {
                        displayInventory(inventory);

                        System.out.println("Please select your desired product's location: ");
                        String selection = userInput.nextLine();

                        if (inventory.containsKey(selection)) {
                            BigDecimal price = new BigDecimal(inventory.get(selection).getItemPrices());
                            if(price.doubleValue() > mb.getBalance().doubleValue()){
                                System.out.println("Your balance is too low, please feed more money");
                               getDisplayPurchaseOptions(inventory);
                            }
                            System.out.println(inventory.get(selection).getItemNames() + " | " + inventory.get(selection).getItemPrices());
                            //while (item.itemCount > 0)
                                for (Map.Entry<String, Item> location : inventory.entrySet()) {
                                    if (selection.equals(location.getKey())) {
                                        Item purchased = location.getValue();
                                        purchased.setItemCount(purchased.getItemCount() - 1);
                                        if (purchased.getItemCount() == -1){
                                            System.out.println("Sold out please choose another item");
                                            getDisplayPurchaseOptions(inventory);
                                        }
                                    }
                                }
                            mb.subtractMoney(price);
                                if (selection.contains("A")) {
                                    System.out.println("Crunch Crunch, Yum!");
                                } else if (selection.contains("B")) {
                                    System.out.println("Munch Munch, Yum!");
                                } else if (selection.contains("C")) {
                                    System.out.println("Glug Glug, Yum!");
                                } else if (selection.contains("D")) {
                                    System.out.println("Chew Chew, Yum!");
                                }
                        } else {
                            System.out.println("Please choose an item in the Vending Machine");
                        }

                    } else if (purchaseChoice == 3) {
                        break;
                    }
                }
            }
        }

        return displayPurchaseOptions;
    }

            private void displayInventory (Map < String, Item > inventory){

                for (String key : inventory.keySet()) {
                    Item shortItem = inventory.get(key);
                    System.out.println(shortItem.getLocations() + " | " + shortItem.getItemNames() + " | " + shortItem.getItemPrices() + " | " + shortItem.getItemTypes() + " | " + shortItem.getItemCount());
                }
            }


        }
