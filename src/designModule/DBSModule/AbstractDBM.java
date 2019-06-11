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
		System.out.println("打开数据库");
	}
	
	public void useDB() {
		System.out.println("使用数据库");
	}
	
	public void closeDB() {
		System.out.println("关闭数据库");
	}
	

}
