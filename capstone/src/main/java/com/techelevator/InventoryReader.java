package com.techelevator;

public class InventoryReader {
    String locations;
    String itemNames;
    String itemPrices;
    String itemTypes;

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

    public InventoryReader(String line) {
        String[] lineParts = line.split("\\|");
        this.locations = lineParts[0];
        this.itemNames = lineParts[1];
        this.itemPrices = lineParts[2];
        this.itemTypes = lineParts[3];
    }
}
