package Biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertAuthor {
	private char au_id;
	private String au_fname;
	private String au_lname;
	
	private Connection conn() throws SQLException
	{
		Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/sergey/eclipse-workspace-enterprise/Biblioteca/src/Biblioteca/biblioteca.db");
		return conn;
	}
	
	public InsertAuthor(char au_id, String au_fname, String au_lname) throws SQLException {
		this.au_id = au_id;
		this.au_fname = au_fname;
		this.au_lname = au_lname;

		Connection conn = this.conn();
		conn.createStatement().execute("INSERT INTO authors (au_id, au_fname, au_lname)" + " VALUES ('" + this.au_id
				+ "', '" + this.au_fname + "', '" + this.au_lname + "')");
	}

}
