package designModule.DBSModule;

public abstract class AbstractDBM {
	
	public void Template() {
		this.connDB();
		this.openDB();
		this.useDB();
		this.closeDB();
	}
	
	public abstract void connDB();
	
	public void openDB() {
		System.out.println("�����ݿ�");
	}
	
	public void useDB() {
		System.out.println("ʹ�����ݿ�");
	}
	
	public void closeDB() {
		System.out.println("�ر����ݿ�");
	}
	

}
