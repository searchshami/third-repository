package com.polymorphism;

public class MethodOverloading {
public void foodcourt() {
	System.out.println("HUNGER HUB");
	System.out.println("**********");
}
public void foodcourt(String name) {
	System.out.println("Proprietor Name "  +name);
}
public void foodcourt( int a) {
	System.out.println("Shop established at :" +a );
}
public static void main(String[] args) {
	MethodOverloading mo = new MethodOverloading();
	mo.foodcourt();
	mo.foodcourt("Shafi");
	mo.foodcourt(2020 );
}
}
