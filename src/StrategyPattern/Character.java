package StrategyPattern;

public abstract class Character {
	public WeaponBehavor weapon;
	
	public abstract void fight();

	public WeaponBehavor getWeapon() {
		return weapon;
	}

	public void setWeapon(WeaponBehavor weapon) {
		this.weapon = weapon;
	}
}
