package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class InventoryRead {


    public Map<String, Item> getItemList() {
        File inventoryFile = new File("C:\\Users\\Student\\workspace\\capstone-1-team-7\\capstone\\vendingmachine.csv");

        Map<String, Item> inventory = new HashMap<>();

            try (Scanner fileReader = new Scanner(inventoryFile)) {
                while (fileReader.hasNextLine()) {
                    String lineOfText = fileReader.nextLine();
                    Item ir = new Item(lineOfText);
                    inventory.put(ir.getLocations(), ir);

                }

            } catch (FileNotFoundException e) {

            }

        return inventory;
    }
}
