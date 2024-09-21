package com.Multilevel;

public class Menus_Trip extends MyTrip_Multi {
public void flights_Types(){
	System.out.println("AirIndia");
	System.out.println("Spicejet");
	System.out.println("Indigo");
	System.out.println("************");
}
public void hotels_Types(){
	System.out.println("Oberoi");
	System.out.println("Hyatt");
	System.out.println("Luxe");
	System.out.println("************");
}
public void Trains_Types(){
	System.out.println("Nizamuddin");
	System.out.println("Duronto");
	System.out.println("Tejas");
	System.out.println("************");
}

public void Buses_Types(){
	System.out.println("Parveen");
	System.out.println("Orange");
	System.out.println("Skyline");
}
public static void main(String[] args) {
	Menus_Trip t = new Menus_Trip();
	t.logIn();
	t.menu();
	t.hotels_Types();
	t.Trains_Types();
	t.flights_Types();
}

}
