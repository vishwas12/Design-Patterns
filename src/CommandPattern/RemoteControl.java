package CommandPattern;

public class RemoteControl {
	
	Command onCommands[];
	Command offCommands[];
	
	public RemoteControl(){
		onCommands = new Command[7];
		offCommands = new Command[7];
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand){
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPressed(int slot){
		onCommands[slot].execute();
	}
	
	public void offButtonWasPressed(int slot){
		offCommands[slot].execute();
	}

}
