package designModule.PhoneControl;
//���ģʽ
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facade facade = new Facade();
		facade.backupSD();
		System.out.println("");
		facade.backupMMC();
	}

}
