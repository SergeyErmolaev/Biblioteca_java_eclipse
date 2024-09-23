package Biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertAuOders {
	private char title_id;
	private char author1;
	private char author2;
	private char author3;
	
	private Connection conn() throws SQLException
	{
		Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/sergey/eclipse-workspace-enterprise/Biblioteca/src/Biblioteca/biblioteca.db");
		return conn;
	}

	public InsertAuOders(char title_id, char author1, char author2, char author3) throws SQLException {
		this.title_id = title_id;
		this.author1 = author1;
		this.author2 = author2;
		this.author3 = author3;
		
		Connection conn = this.conn();
		conn.createStatement().execute("INSERT INTO au_orders (title_id, author1, author2, author3)" + " VALUES ('"
                + this.title_id + "', '" + this.author1 + "', '" + this.author2 + "', '" + this.author3 + "')");
	}
}
