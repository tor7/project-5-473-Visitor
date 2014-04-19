package com.project5;

public class PartsDecorator implements Computer {
	
	Computer tempComputer;
	
	public PartsDecorator(Computer newComputer){
		this.tempComputer = newComputer;
	}

	@Override
	public String getDescription() {
		return tempComputer.getDescription();
	}

	@Override
	public double getCost() {
		return tempComputer.getCost();
	}

}
