package designModule.RoomLamp;

public class FunCommand extends Command{
	private Fun fun = new Fun();
	
	@Override
	public void open() {
		// TODO Auto-generated method stub
		fun.open();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		fun.close();
	}

}
