package CommandPattern;

public class MacroCommand implements Command {
	
	Command[] onCommand;
	
	public MacroCommand(Command []command) {
		// TODO Auto-generated constructor stub
		this.onCommand = command;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for(int i=0;i<onCommand.length;i++){
			onCommand[i].execute();
		}
	}

}
