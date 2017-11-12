package CommandPattern;

public class CeilingFan {
	
	public final static int HIGH = 3;
	public final static int MEDIUM = 2;
	public final static int LOW = 1;
	public final static int OFF = 0;
	
	public void high(){
		System.out.println("Ceiling fan is high");
	}
	
	public void medium(){
		System.out.println("Ceiling fan is medium");
	}
	
	public void low(){
		System.out.println("Ceiling fan is low");
	}
	
	public void off(){
		System.out.println("Ceiling fan is off");
	}

}
