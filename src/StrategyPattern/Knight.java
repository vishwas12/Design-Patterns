package StrategyPattern;

public class Knight extends Character {
	


	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("Knight fighting");
		weapon.useWeapon();
	}

}
