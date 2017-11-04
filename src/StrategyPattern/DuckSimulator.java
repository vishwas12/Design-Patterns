package StrategyPattern;

public class DuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();
		duck.display();
		
		duck = new RubberDuck();
		duck.performFly();
		duck.performQuack();
		duck.display();
	}

}
