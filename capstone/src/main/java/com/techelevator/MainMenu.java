package com.techelevator;

import java.util.Map;
import java.util.Scanner;



public class MainMenu{
    String[] displayMainOptions;

    public String[] getDisplayMainOptions(Map <String,Item> inventory) {
        String[] displayMainOptions = {"(1) Display Vending Machine Items", "(2) Purchase", "(3) Exit", "(4) Sales Report"};
        for (int i = 0; i < displayMainOptions.length-1; i++){
            System.out.println(displayMainOptions[i]);
    }
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please choose a menu option: ");
        String mainMenuChoice = userInput.nextLine();
        int mainChoice = Integer.parseInt(mainMenuChoice);
        if (mainChoice == 1) {
            displayInventory(inventory);
            System.out.println("");
            getDisplayMainOptions(inventory);
        } else if (mainChoice == 2) {
            PurchaseMenu pm = new PurchaseMenu();
            pm.getDisplayPurchaseOptions(inventory);
        } else if (mainChoice == 3) {
            System.exit(0);
        } else if (mainChoice == 4) {
            // Display sales report
            System.out.println("**Total Sales**");
            System.out.println("");
            getDisplayMainOptions(inventory);
        } else {
            System.out.println("Please choose a listed option");
        }
        return displayMainOptions;

    }

    private void displayInventory (Map <String,Item> inventory) {

       for (String key : inventory.keySet()){
           Item shortItem = inventory.get(key);
           System.out.println(shortItem.getLocations() + " | " + shortItem.getItemNames() + " | " + shortItem.getItemPrices() + " | " + shortItem.getItemTypes() + " | " + shortItem.getItemCount());
        }
    }






}



