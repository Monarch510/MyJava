package designModule.RPGgame;
//�򵥹���ģʽ
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = XMLUtil.getClassName();
		Role role = RoleFactory.createRole(str);
	}

}
