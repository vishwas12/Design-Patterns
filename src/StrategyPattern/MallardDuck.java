package StrategyPattern;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		fly = new FlyWithWings();
		quack = new Quack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Mallard Duck");
	}
	
}
