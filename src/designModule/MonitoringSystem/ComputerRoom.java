package designModule.MonitoringSystem;

import java.util.ArrayList;

public class ComputerRoom {
	private ArrayList<ResponseEquipment> reList = new ArrayList<ResponseEquipment>();
	private double temperature;
	
	public double getTemperauture() {
		return temperature;
	}

	public void setTemperauture(double temperature) {
		this.temperature = temperature;
		if(temperature >= 40) {
			System.out.println("�¶ȳ��������¶�");
			this.trigger();
		}
		else
			System.out.println("�¶�����");
	}

	public void register(ResponseEquipment re) {
		this.reList.add(re);
	}
	
	public void trigger() {
		for(ResponseEquipment re:reList) {
			re.response();
		}
	}
}
