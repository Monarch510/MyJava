package designModule.RoomLamp;
//ÃüÁîÄ£Ê½
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoker invoker = new Invoker();
		Command command = (Command) XMLUtil.getClassBean();
		invoker.setCommand(command);
		invoker.open();
		invoker.close();
	}

}
