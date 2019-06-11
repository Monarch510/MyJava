package designModule.War;
//职责链模式
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Officer banzhang = new Banzhang();
		Officer paizhang = new Paizhang();
		Officer lianzhang = new Lianzhang();
		Officer meeting = new Meeting();
		
		banzhang.setOfficer(paizhang);
		paizhang.setOfficer(lianzhang);
		lianzhang.setOfficer(meeting);
		
		Mission mission = new Mission();
		mission.setEnemyNumber(70);
		
		banzhang.handle(mission);
	}

}
