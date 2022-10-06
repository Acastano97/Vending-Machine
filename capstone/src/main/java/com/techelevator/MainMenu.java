package com.techelevator;

import java.io.File;
import java.util.Scanner;



public class MainMenu{
    String[] displayMainOptions;

    public String[] getDisplayMainOptions() {
        String[] displayMainOptions = {"(1) Display Vending Machine Items", "(2) Purchase", "(3) Exit", "(4) Sales Report"};
        for (int i = 0; i < displayMainOptions.length-1; i++){
            System.out.println(displayMainOptions[i]);
    }
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please choose a menu option: ");
        String mainMenuChoice = userInput.nextLine();
        int mainChoice = Integer.parseInt(mainMenuChoice);
        if (mainChoice == 1) {
            // display inventory
        } else if (mainChoice == 2) {
            PurchaseMenu pm = new PurchaseMenu();
            pm.getDisplayPurchaseOptions();
        } else if (mainChoice == 3) {
            System.exit(0);
        } else if (mainChoice == 4) {
            // Display sales report
        } else {
            System.out.println("Please choose a listed option");
        }
        return displayMainOptions;

//    public MainMenu() {
//        String[] displayMainOptions = {"(1) Display Vending Machine Items", "(2) Purchase", "(3) Exit", "(4) Sales Report"};
//        for (int i = 0; i < displayMainOptions.length-1; i++){
//            System.out.println(displayMainOptions[i]);
//        }
    }







}



