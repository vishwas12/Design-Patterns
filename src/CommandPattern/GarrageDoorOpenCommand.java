package CommandPattern;

public class GarrageDoorOpenCommand implements Command {
	
	GarrageDoor garrageDoor;
	
	public  GarrageDoorOpenCommand(GarrageDoor command) {
		this.garrageDoor = command;
	}
	
	@Override
	public void execute() {
		garrageDoor.up();
	}

}
