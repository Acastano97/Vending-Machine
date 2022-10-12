package com.techelevator;

import java.awt.*;
import java.math.BigDecimal;

public class FinishTransaction {
    MoneyBank mb = new MoneyBank();

BigDecimal QUARTER = new BigDecimal(0.25);
BigDecimal DIME = new BigDecimal(0.10);
BigDecimal NICKEL = new BigDecimal(0.05);
BigDecimal PENNY = new BigDecimal(0.01);
int numOfQuarters;
int numOfDimes;
int numOfNickels;
int numOfPennies;


    public FinishTransaction(){

    }

    public void makeChange(BigDecimal balance){
           while (balance.compareTo(balance) > 0.24){
               balance.subtract(QUARTER);
               numOfQuarters++;
           } while (balance.compareTo(balance) > 0.09){
               balance.subtract(DIME);
               numOfDimes++;
           }while (balance.compareTo(balance) > 0.04){
               balance.subtract(NICKEL);
               numOfNickels++;
           }while (balance.compareTo(balance) > 0.00){
               balance.subtract(PENNY);
               numOfPennies++;
           }
        System.out.printf("%s Quarters, %s Dimes, %s Nickels, %s Penny\n", numOfQuarters, numOfDimes, numOfNickels, numOfPennies);
       }
    public void makeChange2(BigDecimal balance){
       BigDecimal balAfterQuarter = balance.divide(QUARTER);
       BigDecimal balAfterDime = balAfterQuarter.divide(DIME);
       BigDecimal balAfterNickel = balAfterDime.divide(NICKEL);
       BigDecimal balAfterPenny = balAfterNickel.divide(PENNY);
       BigDecimal bal = mb.getBalance();
       BigDecimal quarters = bal.subtract(balAfterQuarter);
       BigDecimal numOfQuarter = quarters.divide(QUARTER);
       BigDecimal dimes = balAfterQuarter.subtract(balAfterDime);
       BigDecimal numOfDimes = dimes.divide(DIME);
       BigDecimal nickles = balAfterDime.subtract(balAfterNickel);
       BigDecimal numOfNickles = nickles.divide(NICKEL);
       BigDecimal pennies = balAfterNickel.divide(balAfterPenny);
       BigDecimal numOfPennies = pennies.divide(PENNY);
       System.out.printf("%s Quarters, %s Dimes, %s Nickles, %s Pennies", numOfQuarter, numOfDimes, numOfNickles, numOfPennies);
    }
    public void makeChange3(BigDecimal balance){

    }
}
