package Decorator;

public class StarBuzzCoffe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage darkRoast = new DarkRoast();
		darkRoast = new Milk(darkRoast);
		darkRoast = new Milk(darkRoast);
		//darkRoast = new Whip(darkRoast);
		
		System.out.println(darkRoast.getDescription()+" "+darkRoast.cost());
	}

}
