package designModule.Database;

public class OracleDatabase implements Database{
	
	public Connection createConnection() {
		return new OracleConnection();
	}

	public Statement createStatement() {
		return new OracleStatement();
	}

}
