package StrategyPattern;

public class Queen extends Character {
	

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("Queen fighting");
		weapon.useWeapon();
	}

}
