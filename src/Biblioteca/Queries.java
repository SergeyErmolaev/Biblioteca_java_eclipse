package Biblioteca;
import java.sql.*;

public class Queries {
	
	private Connection conn() throws SQLException
	{
		Connection conn = DriverManager.getConnection("jdbc:sqlite:/home/sergey/eclipse-workspace-enterprise/Biblioteca/src/Biblioteca/biblioteca.db");
		return conn;
	}
	
	public void q1() throws SQLException {
		Connection conn = this.conn();
		ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM titles");
		while (rs.next()) {
			System.out.println(rs.getString("title_name"));
		}
		rs.close();
		conn.close();
	}
}
