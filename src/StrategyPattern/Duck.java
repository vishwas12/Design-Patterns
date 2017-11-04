package StrategyPattern;

public abstract class Duck {
	public FlyBehaviour fly;
	public QuackBehaviour quack;
	
	public void performFly(){
		fly.fly();
	}
	
	public void performQuack(){
		quack.quack();
	}
	
	public abstract void display();
}
