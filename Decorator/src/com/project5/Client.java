package com.project5;

public class Client {
	
	public static void main(String[] args) {
		
		
		// ILLUSTRATION 1: A standard computer with some customizations
		Computer customizedComputer = new Case(new RAM(new StandardComputer()));
		System.out.println("Customized Computer Description: " + customizedComputer.getDescription());
		System.out.println("Customized Computer Cost: $" + customizedComputer.getCost());
		
		System.out.println();
		
		// ILLUSTRATION 2: A standard computer with no customizations
		Computer stdComputer = new StandardComputer();
		System.out.println("Stanard Computer Description: " + stdComputer.getDescription());
		System.out.println("Standard Computer Cost: $" + stdComputer.getCost());
		
		
		
	}

}
