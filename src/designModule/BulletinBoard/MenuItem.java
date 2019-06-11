package designModule.BulletinBoard;

public class MenuItem {
	private Command command;
	private String name;
	
	public MenuItem(Command command,String name) {
		this.command = command;
		this.name = name;
	}
	
	public void click() {
		command.execute();
	}

}
