package Decorator;

public class Milk extends CondimentDecorator {
	
	Beverage beverage;
	
	public Milk(Beverage beverage){
		this.beverage = beverage;
	}
	
	public double cost(){
		return beverage.cost() + 2;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+ ", Milk";
	}
}
