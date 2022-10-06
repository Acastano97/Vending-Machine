package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class FeedMoney {

   private BigDecimal totalBalance;
   private BigDecimal feedBalance = new BigDecimal("0");

   public BigDecimal getFeedBalance() {
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter the whole dollar amount you would like to add to the balance");
      String moneyAddedStr = userInput.nextLine();
      BigDecimal moneyAdded = new BigDecimal(moneyAddedStr);
      BigDecimal newFeedBalance = feedBalance.add(moneyAdded);

      return newFeedBalance;
   }

}
