package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {

    private int itemQuantity = 5;

    public int getItemQuantity() {
        File inventory = new File("C:\\Users\\Student\\workspace\\capstone-1-team-7\\capstone\\vendingmachine.csv");
        List<InventoryReader> allInventory = new ArrayList<>();
        {
            try (Scanner fileReader = new Scanner(inventory)) {
                while (fileReader.hasNextLine()) {
                    String lineOfText = fileReader.nextLine();
                    InventoryReader ir = new InventoryReader(lineOfText);
                    allInventory.add(ir);

                }

            } catch (FileNotFoundException e) {

            }
            for (InventoryReader item : allInventory) {
                System.out.println(item.getItemNames() +" | " + itemQuantity);

            }
            System.out.println("");
            return itemQuantity;
        }

    }
}