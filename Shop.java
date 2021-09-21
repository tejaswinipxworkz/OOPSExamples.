package com.xworkz.oops;

public class Shop {
	String shopName;
	String shopArea;
	String ingredients;
	int materialCost;

	public void serve() {
		System.out.println("Serve the clients at a counter");
	}

	public void giveChanges() {
		System.out.println("Giving changes to customers");
	}

	public void answer() {
		System.out.println("Answer customer's enquiries");
	}
}
