package StrategyPattern;

public class King extends Character {
	

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("king fighting..");
		weapon.useWeapon();
	}

}
