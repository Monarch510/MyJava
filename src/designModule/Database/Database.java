package designModule.Database;

public interface Database {
	
	public abstract Connection createConnection();
	
	public abstract Statement createStatement();
	
}
