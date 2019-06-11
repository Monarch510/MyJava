package designModule.War;

public class Lianzhang extends Officer{

	@Override
	public void handle(Mission mission) {
		// TODO Auto-generated method stub
		if(mission.getEnemyNumber() < 100) {
			System.out.println("连长下达作战命令");
		}
		else {
			this.officer.handle(mission);
		}
	}

}
