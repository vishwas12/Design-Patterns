package TemplateMethodPattern;

public class BeverageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tea tea = new Tea();
		tea.prepareRecipe();
		
		Coffee coffee = new Coffee();
		coffee.prepareRecipe();

	}

}
