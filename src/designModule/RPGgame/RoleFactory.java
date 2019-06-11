package designModule.RPGgame;

public class RoleFactory {
	
	static public Role createRole(String str) {
		Role role = null;
		if(str.equals("angle")) {
			role = new AngleRole();
		}
		else if(str.equals("hero")) {
			role = new HeroRole();
		}
		else if(str.equals("witch")) {
			role = new WitchRole();
		}
		else {
			System.out.println("��������Ҫ�����Ķ���");
		}
		return role;
	}
}
