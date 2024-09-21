package com.encapsulation;

public class Myself {
private String uname = "Shami";
private String pwd = "Sweet*29";
private void voter_Id (){

	System.out.println("F_Name");
	System.out.println("M_Name");
	System.out.println("DOB");
	System.out.println("Mail ID");
	System.out.println("Mobile");
	
}

public static void main(String [] args) {
	Myself m = new Myself();
	System.out.println(m.uname);
	System.out.println(m.pwd);
	m.voter_Id();
}
}
