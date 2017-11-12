package CommandPattern;

public class CeilingFanHighCommand implements Command {
	
	CeilingFan  ceilingFan;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.high();
	}

}
