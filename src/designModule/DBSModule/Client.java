package designModule.DBSModule;
//ģ�巽��ģʽ
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractDBM dbm = (AbstractDBM)XMLUtil.getClassBean();
		dbm.Template();
	}

}
