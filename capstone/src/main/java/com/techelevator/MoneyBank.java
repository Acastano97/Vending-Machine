package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class MoneyBank {
   private BigDecimal feedBalance = BigDecimal.ZERO;
   private BigDecimal subMoney = BigDecimal.ZERO;


   public MoneyBank()   {

   }
   public BigDecimal addMoney(BigDecimal newFunds) {
      feedBalance = feedBalance.add(newFunds);
      return feedBalance;
   }
   public BigDecimal subtractMoney(BigDecimal itemPrice){
      feedBalance = feedBalance.subtract(itemPrice);
      return feedBalance;
   }

//   public void setFeedBalance(BigDecimal feedBalance) {
//      this.feedBalance = feedBalance;
//   }

   public BigDecimal getBalance(){
      return feedBalance;
   }
//   public void feedMoney() {
//      Scanner userInput = new Scanner(System.in);
//      System.out.println("Please enter the amount of money you would like to add: ");
//      String moneyAddedStr = userInput.nextLine();
//      BigDecimal moneyAdded = new BigDecimal(moneyAddedStr);
//      addMoney(moneyAdded);
//   }


}
