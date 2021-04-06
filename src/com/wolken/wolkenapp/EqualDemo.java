package com.wolken.wolkenapp;

public class EqualDemo {

	public static void main(String[] args) {
		// string literalway
		// TODO Auto-generated method stub
		String name1 = "moosa";
		String name2 = "moosa";
		//using new
	String  name3 = new String("'Moosa");
	String  name4= new String("Moosa");
	String name5 = new String("MOOSA");
		if (name1.equals(name2))
			System.out.println("Names are equal");
		else
			System.out.println("Names are not equal");

		if (name1 == name2)
			System.out.println("Names are equal");
		else
			System.out.println("Names are not equal");

		if (name3.equals(name4))
			System.out.println("Names are equal");
		else
			System.out.println("Names are not equal");

		if (name3 == name4)
			System.out.println("Names are equal");
		else
			System.out.println("Names are not equal");
		
		if (name1 == name5)
			System.out.println("Names are equal");
		else
			System.out.println("Names are not equal");
		
		if (name1.equals(name5))
			System.out.println("Names are equal");
		else
			System.out.println("Names are not equal");
		
		
		
	}



		
	}


