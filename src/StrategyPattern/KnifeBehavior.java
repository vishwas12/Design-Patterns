package StrategyPattern;

public class KnifeBehavior implements WeaponBehavor {
	@Override
	public void useWeapon(){
		System.out.println("use knife");
	}
}
