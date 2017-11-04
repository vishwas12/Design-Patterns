package StrategyPattern;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		// TODO Auto-generated constructor stub
		fly = new FlyNoWay();
		quack = new Squeak();
	}
	
	@Override
	public void display() {
		System.out.println("Rubber Duck");
	}
}
