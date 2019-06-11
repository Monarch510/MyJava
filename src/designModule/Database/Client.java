package designModule.Database;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database database;
		database = (Database)XMLUtil.getClassBean();
		Connection connection;
		Statement statement;
		connection = database.createConnection();
		statement = database.createStatement();
		connection.getConnection();
		statement.getStatement();
	}

}
