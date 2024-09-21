package com.Multilevel;

public class Offers_Trip extends Menus_Trip {
public void offers() {
	System.out.println("Platinum membership 40%");
	System.out.println("Golden 25%");
	System.out.println("silver 15%");
}
public static void main(String[] args) {
	Offers_Trip ot = new Offers_Trip();
	ot.logIn();
	ot.menu();
	ot.offers_Membership();
}
}
