package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class PurchaseMenu {
    FeedMoney fm = new FeedMoney();
    private BigDecimal startingBalance = new BigDecimal("0.00");
    private String[] displayPurchaseOptions;
    private BigDecimal feedBalance = new BigDecimal("0.00");

    public String[] getDisplayPurchaseOptions()  {


        String[] displayPurchaseOptions = {"(1) Feed Money", "(2) Select Product", "(3) Finish Transaction"};
        for (int i = 0; i < displayPurchaseOptions.length; i++){
            System.out.println(displayPurchaseOptions[i]);
        }
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please choose a menu option: ");
        String PurchaseMenuChoice = userInput.nextLine();
        int purchaseChoice = Integer.parseInt(PurchaseMenuChoice);
        if (purchaseChoice == 1){
            System.out.println("Current Money Provided: " + fm.getFeedBalance());

        }else if (purchaseChoice == 2){

        }else if (purchaseChoice == 3){

        }else{

        }
        return displayPurchaseOptions;
    }
}
