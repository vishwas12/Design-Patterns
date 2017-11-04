package StrategyPattern;

public class Troll extends Character {
	
	

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("Troll fighting");
		weapon.useWeapon();
	}

}
