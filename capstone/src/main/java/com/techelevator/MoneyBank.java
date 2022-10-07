package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class MoneyBank {
   PurchaseProcess pp = new PurchaseProcess();
   private BigDecimal intialBalance = new BigDecimal("0");
   private BigDecimal feedBalance;


   public BigDecimal addMoney() {
      intialBalance.add(pp.getMoneyAdded());
      return addMoney();

   }
   public BigDecimal getBalance(){
      return intialBalance.add(pp.getMoneyAdded());
   }

}
