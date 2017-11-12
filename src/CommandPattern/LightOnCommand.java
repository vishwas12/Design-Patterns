package CommandPattern;

public class LightOnCommand implements Command {
	
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
	}

}
