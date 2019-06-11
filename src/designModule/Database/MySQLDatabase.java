package designModule.Database;

public class MySQLDatabase implements Database{

	public Connection createConnection() {
		return new MySQLConnection();
	}

	public Statement createStatement() {
		return new MySQLStatement();
	}

}
