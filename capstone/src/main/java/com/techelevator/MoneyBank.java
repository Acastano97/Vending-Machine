package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class MoneyBank {
   private BigDecimal feedBalance = BigDecimal.ZERO;


   public void addMoney(BigDecimal newFunds) {
      feedBalance = feedBalance.add(newFunds);

   }
   public BigDecimal getBalance(){
      return feedBalance;
   }

}
