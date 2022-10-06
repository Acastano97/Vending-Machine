package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static void main(String[] args) {

    }

    public Menu(String firstSlot, String secondSlot, String thirdSlot) {

        List<String> slots = new ArrayList<>();
        slots.add(firstSlot);
        slots.add(secondSlot);
        slots.add(thirdSlot);

        for(int i = 0; i < slots.size(); i++){
            System.out.println("("+(i+1)+") " + slots.);
        }


        System.out.printf("(1) %s \n (2) %s \n, (3) %s \n", firstSlot, secondSlot, thirdSlot);
    }

}
