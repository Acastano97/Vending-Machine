package com.techelevator;

import java.util.Scanner;

public class VendingMachineCLI {


	public VendingMachineCLI() {
	}

	public void run() {
		InventoryRead ir = new InventoryRead();
		MainMenu mm = new MainMenu();
		mm.getDisplayMainOptions(ir.getItemList());
	}

	public static void main(String[] args) {
		VendingMachineCLI cli = new VendingMachineCLI();
		cli.run();






	}
}
