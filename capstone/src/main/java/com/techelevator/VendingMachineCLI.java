package com.techelevator;

import java.util.Scanner;

public class VendingMachineCLI {


	public VendingMachineCLI() {
	}

	public void run() {
	}

	public static void main(String[] args) {
		VendingMachineCLI cli = new VendingMachineCLI();
		cli.run();
		MainMenu mm = new MainMenu();
		PurchaseMenu pm = new PurchaseMenu();
		mm.getDisplayMainOptions();
		pm.getDisplayPurchaseOptions();




	}
}
