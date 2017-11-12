package CommandPattern;

public class RemoteControlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		SimpleRemoteControl control = new SimpleRemoteControl();
		control.setCommand(lightOnCommand);
		control.buttonWasPressed();
		control.setCommand(lightOffCommand);
		control.buttonWasPressed();*/
		
		
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		
		CeilingFan ceilingFan = new CeilingFan();
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		
		GarrageDoor garrageDoor = new GarrageDoor();
		GarrageDoorOpenCommand garrageDoorOpenCommand = new GarrageDoorOpenCommand(garrageDoor);
		
		RemoteControl remoteControl = new RemoteControl();
		remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
		remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand);
		remoteControl.setCommand(2, garrageDoorOpenCommand, ceilingFanOffCommand);
		
		remoteControl.onButtonWasPressed(0);
		remoteControl.onButtonWasPressed(1);
		remoteControl.onButtonWasPressed(2);
		
		remoteControl.offButtonWasPressed(0);
		remoteControl.offButtonWasPressed(1);
		remoteControl.offButtonWasPressed(2);
		
		Command partyOn[] = {lightOnCommand,ceilingFanHighCommand};
		Command partyOff[] = {lightOffCommand,ceilingFanOffCommand};
		
		MacroCommand macroCommandOn = new MacroCommand(partyOn);
		MacroCommand macroCommandOff = new MacroCommand(partyOff);
		
		remoteControl.setCommand(3, macroCommandOn, macroCommandOff);
		remoteControl.onButtonWasPressed(3);
		remoteControl.offButtonWasPressed(3);
	}

}
