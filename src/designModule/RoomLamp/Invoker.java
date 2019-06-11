package designModule.RoomLamp;

public class Invoker {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}

	public void open() {
		command.open();
	}
	
	public void close() {
		command.close();
	}
}
