package Biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertPublishers {
	private String pub_id;
	private String pub_name;
	private String city;
	
	private Connection conn() throws SQLException
	{
		Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/sergey/eclipse-workspace-enterprise/Biblioteca/src/Biblioteca/biblioteca.db");
		return conn;
	}

	public InsertPublishers (String pub_id, String pub_name, String city) throws SQLException{
		this.pub_id = pub_id;
		this.pub_name = pub_name;
		this.city = city;
		
		Connection conn = this.conn();
		conn.createStatement().execute("INSERT INTO publishers (pub_id, pub_name, city)" + " VALUES ('" + this.pub_id
				+ "', '" + this.pub_name + "', '" + this.city + "')");
		conn.close();
	}

}
