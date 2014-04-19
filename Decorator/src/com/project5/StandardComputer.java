package com.project5;

public class StandardComputer implements Computer {

	@Override
	public String getDescription() {
		return "Standard Computer, with 2GB of RAM";
	}

	@Override
	public double getCost() {
		return 499.99;
	}

}
