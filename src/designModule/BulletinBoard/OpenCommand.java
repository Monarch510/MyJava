package designModule.BulletinBoard;

public class OpenCommand extends Command{
	private BoardScreen boardScreen = new BoardScreen(); 

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		boardScreen.open();
	}

}
