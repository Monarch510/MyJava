package designModule.War;

public class Banzhang extends Officer{
	
	@Override
	public void handle(Mission mission) {
		// TODO Auto-generated method stub
		if(mission.getEnemyNumber() < 10) {
			System.out.println("�೤�´���ս����");
		}
		else {
			this.officer.handle(mission);
		}
	}

}
