package designModule.MonitoringSystem;

public class CautionLightObserver implements ResponseEquipment{
	private CautionLight cautionLight = new CautionLight();
	
	@Override
	public void response() {
		// TODO Auto-generated method stub
		cautionLight.flicker();
	}

}
