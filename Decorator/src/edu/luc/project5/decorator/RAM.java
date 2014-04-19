package edu.luc.project5.decorator;

public class RAM extends PartsDecorator {

	public RAM(Computer newComputer) {
		super(newComputer);
	}
	
	@Override
	public String getDescription() {
		return tempComputer.getDescription() + ", 4GB RAM Extension";
	}

	@Override
	public double getCost() {
		return tempComputer.getCost() + 99.99;
	}

}
