package Biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InsertTitle {
	private String pub_id;
	private String title_id;

	private String title_name;
	private String type;

	private int pages;
	private String year;
	private String month;
	private String day;
	private int us_id;
	
	private Connection conn() throws SQLException
	{
		Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/sergey/eclipse-workspace-enterprise/Biblioteca/src/Biblioteca/biblioteca.db");
		return conn;
	}

	public InsertTitle (String title_id, String title_name, String type, String pub_id,  int pages, 
			String year, String month, String day, int us_id) throws SQLException {
		this.title_id = title_id;
		this.title_name = title_name;
		this.type = type;
		this.pub_id = pub_id;
		this.pages = pages;
		this.year = year;
		this.month = month;
		this.day = day;
		this.us_id = us_id;
		
		Connection conn = this.conn();
		conn.createStatement().execute("INSERT INTO titles (title_id, title_name, type, pub_id, pages, pubdate, us_id)"
				+ " VALUES ('" + this.title_id + "', '" + this.title_name + "', '" + this.type + "', '" + this.pub_id + "', '" + this.pages 
				+ "', '" + this.year + "-" + this.month + "-" + this.day + "', '" + this.us_id + "')");
	}

}
