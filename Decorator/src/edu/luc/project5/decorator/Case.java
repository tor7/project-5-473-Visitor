package edu.luc.project5.decorator;

public class Case extends PartsDecorator {

	public Case(Computer newComputer) {
		super(newComputer);
	}
	
	@Override
	public String getDescription() {
		return tempComputer.getDescription() + ", Black Case";
	}

	@Override
	public double getCost() {
		return tempComputer.getCost() + 19.99;
	}

}
