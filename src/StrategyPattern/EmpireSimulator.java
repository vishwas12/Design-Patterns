package StrategyPattern;

public class EmpireSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character charater = new King();
		charater.setWeapon(new AxeBehavior());
		charater.fight();
		
		charater = new Queen();
		charater.setWeapon(new KnifeBehavior());
		charater.fight();
		
	}

}
