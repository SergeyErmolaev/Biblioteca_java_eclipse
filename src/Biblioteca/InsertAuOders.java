package Biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertAuOders {
	private String title_id;
	private String author1;
	private String author2;
	private String author3;
	
	private Connection conn() throws SQLException
	{
		Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/sergey/eclipse-workspace-enterprise/Biblioteca/src/Biblioteca/biblioteca.db");
		return conn;
	}
	
	public InsertAuOders(String title_id, String author1) throws SQLException {
		this.title_id = title_id;
		this.author1 = author1;

		Connection conn = this.conn();
		conn.createStatement().execute("INSERT INTO au_orders (title_id, author1)" + " VALUES ('" + this.title_id
				+ "', '" + this.author1 + "')");
	}
	
	public InsertAuOders(String title_id, String author1, String author2) throws SQLException {
        this.title_id = title_id;
        this.author1 = author1;
        this.author2 = author2;
        
        Connection conn = this.conn();
        conn.createStatement().execute("INSERT INTO au_orders (title_id, author1, author2)" + " VALUES ('"
                + this.title_id + "', '" + this.author1 + "', '" + this.author2 + "')");
        }

	public InsertAuOders(String title_id, String author1, String author2, String author3) throws SQLException {
		this.title_id = title_id;
		this.author1 = author1;
		this.author2 = author2;
		this.author3 = author3;
		
		Connection conn = this.conn();
		conn.createStatement().execute("INSERT INTO au_orders (title_id, author1, author2, author3)" + " VALUES ('"
                + this.title_id + "', '" + this.author1 + "', '" + this.author2 + "', '" + this.author3 + "')");
	}
}
