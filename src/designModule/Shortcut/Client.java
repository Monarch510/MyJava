package designModule.Shortcut;
//代理模式
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject application = new Application();
		Subject icon = new Icon(application);
		icon.run();
	}

}
