package TemplateMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage {

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("steeping the tea");
	}

	@Override
	public void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("adding lemon");
	}
	
	@Override
	public boolean customerWantsCondiments() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String answer = br.readLine();
			if("y".equals(answer.toLowerCase()))
				return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

}
