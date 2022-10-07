package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class PurchaseProcess {

    private BigDecimal moneyAdded;

    public BigDecimal getMoneyAdded() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the amount of money you would like to add: ");
        String moneyAddedStr = userInput.nextLine();
        BigDecimal moneyAdded = new BigDecimal(moneyAddedStr);
        return moneyAdded;
    }

    public PurchaseProcess() {

    }
}
