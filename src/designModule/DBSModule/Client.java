package designModule.DBSModule;
//模板方法模式
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDBM dbm = (AbstractDBM)XMLUtil.getClassBean();
		dbm.Template();
	}

}
