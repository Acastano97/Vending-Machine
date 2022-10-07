package com.techelevator;

import java.util.*;

public class ProductSelector {

        InventoryRead ir = new InventoryRead();

        FeedMoney fm = new FeedMoney();




        public String getProductSelection(Map<String, Item> inventory){
            Scanner userInput = new Scanner(System.in);
            System.out.println("Please select your desired product's location: ");
            String selection = userInput.nextLine();
            Item item = new Item();
            if(inventory.containsKey(selection)){
                System.out.println(inventory.get(selection).getItemNames() + " | " + inventory.get(selection).getItemPrices());
                    if(selection.contains("A")){
                        System.out.println("Crunch Crunch, Yum!");
                    } else if (selection.contains("B")){
                        System.out.println("Munch Munch, Yum!");
                    }else if (selection.contains("C")){
                        System.out.println("Glug Glug, Yum!");
                    }else if (selection.contains("D")){
                        System.out.println("Chew Chew, Yum!");
                    }
            } else {
                System.out.println("Please choose an item in the Vending Machine");
            }

            return null;
        }


}
