package designModule.War;

public class Paizhang extends Officer{

	@Override
	public void handle(Mission mission) {
		// TODO Auto-generated method stub
		if(mission.getEnemyNumber() < 50) {
			System.out.println("�ų��´���ս����");
		}
		else {
			this.officer.handle(mission);
		}
	}

}
