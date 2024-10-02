package Biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeleteItems {
	private String title_id;
	private String au_id;
	private String pub_id;
	private int us_id;
	
	
	private Connection conn() throws SQLException
	{
		Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/sergey/eclipse-workspace-enterprise/Biblioteca/src/Biblioteca/biblioteca.db");
		return conn;
	}
	
	public void deleteTitles(String title_id) throws SQLException {
        this.title_id = title_id;

        Connection conn = this.conn();
        conn.createStatement().execute("DELETE FROM titles WHERE title_id = '" + this.title_id + "'");
        conn.close();
    }
	
	public void deleteAuthors(String au_id) throws SQLException {
		this.au_id = au_id;

		Connection conn = this.conn();
		conn.createStatement().execute("DELETE FROM authors WHERE au_id = '" + this.au_id + "'");
		conn.close();
	}
	
	public void deletePublishers(String pub_id) throws SQLException {
		this.pub_id = pub_id;

		Connection conn = this.conn();
		conn.createStatement().execute("DELETE FROM publishers WHERE pub_id = '" + this.pub_id + "'");
		conn.close();
	}
	
	public void deleteUsers(int us_id) throws SQLException {
		this.us_id = us_id;

		Connection conn = this.conn();
		conn.createStatement().execute("DELETE FROM users WHERE us_id = '" + this.us_id + "'");
		conn.close();
	}
	
	public void deleteTitleAuthors(String title_id) throws SQLException {
		this.title_id = title_id;

		Connection conn = this.conn();
		conn.createStatement().execute("DELETE FROM title_authors WHERE title_id = '" + this.title_id + "'");
		conn.close();
	}
	
	public void deleteAuOrders(String title_id) throws SQLException {
		this.title_id = title_id;

		Connection conn = this.conn();
		conn.createStatement().execute("DELETE FROM au_orders WHERE title_id = '" + this.title_id + "'");
		conn.close();
	}
}
