package designModule.Shortcut;
//����ģʽ
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject application = new Application();
		Subject icon = new Icon(application);
		icon.run();
	}

}
