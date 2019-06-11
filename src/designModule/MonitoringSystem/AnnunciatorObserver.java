package designModule.MonitoringSystem;

public class AnnunciatorObserver implements ResponseEquipment{
	private Annunciator annunciator = new Annunciator();
	
	@Override
	public void response() {
		// TODO Auto-generated method stub
		annunciator.alarm();
	}

}
