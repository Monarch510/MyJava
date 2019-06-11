package designModule.BulletinBoard;
//����һ������ģʽ
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Command c1 = new OpenCommand();
		Command c2 = new CreateCommand();
		Command c3 = new EditCommand();
		
		MenuItem m1 = new MenuItem(c1,"��");
		MenuItem m2 = new MenuItem(c2,"�½�");
		MenuItem m3 = new MenuItem(c3,"�༭");
		
		Menu menu = new Menu();
		menu.addMenu(m1);
		menu.addMenu(m2);
		menu.addMenu(m3);
		
		m1.click();
		m2.click();
		m3.click();
	}

}
