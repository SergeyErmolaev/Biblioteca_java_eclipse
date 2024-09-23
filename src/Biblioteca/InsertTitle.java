package Biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertTitle {
	private char pub_id;
	private char title_id;

	private String title_name;
	private String type;

	private int pages;
	private int day;
	private int month;
	private int year;
	
	private Connection conn() throws SQLException
	{
		Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/sergey/eclipse-workspace-enterprise/Biblioteca/src/Biblioteca/biblioteca.db");
		return conn;
	}

	public void it (char au_id, char pub_id, char title_id, String au_fname, String au_lname, String title_name,
			String pub_name, String city, String type, int pages, int day, int month, int year, int au_order) throws SQLException {
		this.pub_id = pub_id;
		this.title_id = title_id;
		this.title_name = title_name;
		this.type = type;
		this.pages = pages;
		this.day = day;
		this.month = month;
		this.year = year;
		
		Connection conn = this.conn();
		conn.createStatement().execute("INSERT INTO titles (title_id, title_name, type, pub_id, pages, pubdate)"
				+ " VALUES ('" + this.title_id + "', '" + this.title_name + "', '" + this.type + "', '" + this.pub_id + "', '" + this.pages 
				+ "', '" + this.year + "-" + this.month + "-" + this.day + "')");
	}

}
