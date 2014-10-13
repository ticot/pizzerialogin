package servlet;

import java.sql.*;


public class ConnectionManager {
	public Connection doConnection(){
	Connection con = null;

	// KIRJAUTUMISTIEDOT
	String username = "a1303481";
	String password = "voCUjJ36s";
	String url = "jdbc:mariadb://localhost/a1303481";

	try {
		Class.forName("org.mariadb.jdbc.Driver").newInstance(); // Ladataan
																// ajurit

		con = DriverManager.getConnection(url, username, password); // Yhteyden
																	// muodostus

	} catch (Exception e) {
		System.out.println("Tietokanta yhteys epäonnistui");
		e.printStackTrace();
	}
	return con;
}

public void closeConnection(Connection con) {
	try {
		if (con != null && !con.isClosed())
			con.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
