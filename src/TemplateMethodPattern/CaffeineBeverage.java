package TemplateMethodPattern;

public abstract class CaffeineBeverage {
	
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments())
			addCondiments();
	}
	
	public abstract void brew();
	
	public abstract void addCondiments();
	
	void boilWater(){
		System.out.println("boiling water");
	}
	
	void pourInCup(){
		System.out.println("Pouring in cup");
	}
	
	public boolean customerWantsCondiments(){
		return true;
	}

}
