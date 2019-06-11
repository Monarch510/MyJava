package designModule.MonitoringSystem;

public class InsulatedDoorObserver implements ResponseEquipment{
	private InsulatedDoor insulatedDoor = new InsulatedDoor();
	@Override
	public void response() {
		// TODO Auto-generated method stub
		insulatedDoor.close();
	}

}
