package designModule.MonitoringSystem;
//适配器和观察者模式
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResponseEquipment an = new AnnunciatorObserver();
		ResponseEquipment ca = new CautionLightObserver();
		ResponseEquipment in = new InsulatedDoorObserver();
		ResponseEquipment se = new SecurityDoorObserver();
		
		ComputerRoom cr = new ComputerRoom();
		cr.register(an);
		cr.register(ca);
		cr.register(in);
		cr.register(se);
		
		double temperature = (double)(XMLUtil.getClassName());
		
		cr.setTemperauture(temperature);
	}

}
