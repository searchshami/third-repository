package com.polymorphism;

public class MethodRiding extends MethodOverloading{
public void gazette() {
	System.out.println("Name change Y");
}
public void gazette (String name) {
System.out.println(" Lara" +name );		
}
public void gazette(char a) { 
	System.out.println("Initial Z"  +a);
}
public static void  main(String[] args) {
	MethodRiding mr= new MethodRiding();
	mr.gazette();
	mr.gazette("Lara");
	mr.gazette('Z');
}
}


