package Decorator;

public abstract class Beverage {
	
	String description = "UNKNOWN BEVERAGE";
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double cost();

}
