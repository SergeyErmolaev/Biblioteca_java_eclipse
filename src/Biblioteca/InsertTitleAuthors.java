package Biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertTitleAuthors {
	private String title_id;
	private String au_id;
	private int au_order;
	
	private Connection conn() throws SQLException
	{
		Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/sergey/eclipse-workspace-enterprise/Biblioteca/src/Biblioteca/biblioteca.db");
		return conn;
	}

	public InsertTitleAuthors(String title_id, String au_id, int au_order) throws SQLException {
		this.title_id = title_id;
		this.au_id = au_id;
		this.au_order = au_order;
		
		Connection conn = this.conn();
		conn.createStatement().execute("INSERT INTO title_authors (title_id, au_id, au_order)" + " VALUES ('"
				+ this.title_id + "', '" + this.au_id + "', '" + this.au_order + "')");
	}
}
