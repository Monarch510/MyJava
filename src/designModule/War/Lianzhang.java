package designModule.War;

public class Lianzhang extends Officer{

	@Override
	public void handle(Mission mission) {
		// TODO Auto-generated method stub
		if(mission.getEnemyNumber() < 100) {
			System.out.println("�����´���ս����");
		}
		else {
			this.officer.handle(mission);
		}
	}

}
