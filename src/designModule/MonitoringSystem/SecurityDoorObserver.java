package designModule.MonitoringSystem;

public class SecurityDoorObserver implements ResponseEquipment{
	private SecurityDoor securityDoor = new SecurityDoor();
	@Override
	public void response() {
		// TODO Auto-generated method stub
		securityDoor.open();
	}
	
}
