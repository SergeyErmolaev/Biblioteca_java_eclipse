package Biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertUser {
	private char us_id;
	private String us_fname;
	private String us_lname;
	private String role;
	
	private Connection conn() throws SQLException
	{
		Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/sergey/eclipse-workspace-enterprise/Biblioteca/src/Biblioteca/biblioteca.db");
		return conn;
	}
	
	public InsertUser(char us_id, String us_fname, String us_lname, String role) throws SQLException {
		this.us_id = us_id;
		this.us_fname = us_fname;
		this.us_lname = us_lname;
		this.role = role;

		Connection conn = this.conn();
		conn.createStatement().execute("INSERT INTO users (us_id, us_fname, us_lname, role)" + " VALUES ('" + this.us_id
				+ "', '" + this.us_fname + "', '" + this.us_lname + "', '" + this.role + "')");
	}
}
