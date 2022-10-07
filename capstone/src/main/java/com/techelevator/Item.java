package com.techelevator;

import java.math.BigDecimal;

public class Item {

    String locations;
    String itemNames;
    String itemPrices;
    String itemTypes;
    int itemCount = 5;

    public Item() {

    }

    public int getItemCount() {
        return itemCount;
    }

    public String getLocations() {
        return locations;
    }

    public String getItemNames() {
        return itemNames;
    }

    public String getItemPrices() {
        return itemPrices;
    }

    public String getItemTypes() {
        return itemTypes;
    }

    public Item(String line) {
        String[] lineParts = line.split("\\|");
        this.locations = lineParts[0];
        this.itemNames = lineParts[1];
        this.itemPrices = lineParts[2];
        this.itemTypes = lineParts[3];
    }
    public void getItemInfo(){
        Item item = new Item();
        System.out.println(item.getItemNames() + item.getItemPrices());
    }

}
