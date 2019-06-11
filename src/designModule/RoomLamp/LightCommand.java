package designModule.RoomLamp;

public class LightCommand extends Command{
	private Light light = new Light();
	
	@Override
	public void open() {
		// TODO Auto-generated method stub
		light.open();
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		light.close();
	}
	

}
